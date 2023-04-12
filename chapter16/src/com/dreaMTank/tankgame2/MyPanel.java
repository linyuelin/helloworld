package com.dreaMTank.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author 林
 * @versoin 1.0
 * 坦克大战绘图区域
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);//初始化自己的坦克

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色

        //编写方法，画出坦克
         drawTank(hero.getX(),hero.getY(),g,0,1);
        drawTank(hero.getX()+100,hero.getY(),g,0,0);

    }


    /**
     *
     * @param x   坦克左上角横坐标
     * @param y   坦克左上角众坐标
     * @param g   画笔
     * @param direct 坦克方向
     * @param type  坦克类型
     */
    public void drawTank(int x, int y, Graphics g,int direct,int type){
        switch (type){
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向绘制坦克
        switch (direct){
            case 0:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);

                break;
            default:
                System.out.println("暂时没有处理");
        }


    }
}
