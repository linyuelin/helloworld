package com.dreaMTank.dao_.test;

import com.dreaMTank.dao_.dao.ActorDAO;
import com.dreaMTank.dao_.dao.BasicDAO;
import com.dreaMTank.dao_.dao.GoodsDAO;
import com.dreaMTank.dao_.domain.Goods;
import com.dreaMTank.dao_.domain.actor;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestDAO {
    //测试
    @Test
    public void testActorDAO(){
        ActorDAO actorDAO = new ActorDAO();
        List<actor> actors = actorDAO.queryMulti("select * from actor where id >= ?", actor.class, 1);
        for (actor actor : actors) {
            System.out.println(actor);
        }


         //单行
        actor actor = actorDAO.querySingle("select * from actor where id >= ?", actor.class, 3);
        System.out.println(actor);

        //单行单列
        Object o = actorDAO.queryScalar("select name from actor where id = ?", 2);
        System.out.println(o);

        int update = actorDAO.update("insert into actor values(null,?,?,?,?)", "shitailong", "男", "1976-4-5", "45555");
        System.out.println(update > 0 ? "成功":"执行未影响");
    }


    @Test
    public void  testGoodsDAO(){
        GoodsDAO goodsDAO = new GoodsDAO();
        goodsDAO.update("insert into goods values(null,?,?)","华为手机","2000");
        goodsDAO.update("insert into goods values(null,?,?)","苹果手机","3000");
        goodsDAO.update("insert into goods values(null,?,?)","小米手机","2000");

    }
    @Test
    public void  testGoodsDAO_select(){
        GoodsDAO goodsDAO = new GoodsDAO();
        List<Goods> goods = goodsDAO.queryMulti("select * from goods ", Goods.class, null);
        for (Goods good : goods) {
            System.out.println(good);
        }

    }

}

