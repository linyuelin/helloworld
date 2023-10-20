package com.itheima.service.impl;

import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeoutException;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils ;


//    @Override
////    @Cacheable(value = "smsCode",key = "#tele")
//    @CachePut(value = "smsCode",key = "#tele")
//    public String senCodeToSMS(String tele) {
//        String code = codeUtils.generator(tele);
//        return code;
//    }
//
//    @Override
//    public boolean checkCode(SMSCode smsCode) {
//        String code = smsCode.getCode();
//        String cacheCode = codeUtils.get(smsCode.getTele());
//        return code.equals(cacheCode);
//    }




    @Autowired
    private MemcachedClient memcachedClient;
    //使用memcached
    @Override
    public String senCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        try {
            memcachedClient.set(tele,10,code);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (MemcachedException e) {
            throw new RuntimeException(e);
        }
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String  code = null;
        try {
            code = memcachedClient.get(smsCode.getTele());
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (MemcachedException e) {
            throw new RuntimeException(e);
        }
        return smsCode.getCode().equals(code);
    }

}
