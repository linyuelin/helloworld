package com.dreaMTank.tankgame03;

import javax.swing.*;


/**
 * @author 林
 * @versoin 1.0
 */
public class TankGame03 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame03 tankGame01 = new TankGame03();
    }

    public TankGame03() {

        mp = new MyPanel();

        Thread thread = new Thread(mp);
        thread.start();


        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1200, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
