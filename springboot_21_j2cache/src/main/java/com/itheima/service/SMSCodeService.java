package com.itheima.service;

import com.itheima.domain.SMSCode;

public interface SMSCodeService {

    public String senCodeToSMS(String tele);
    public boolean checkCode(SMSCode smsCode);

}
