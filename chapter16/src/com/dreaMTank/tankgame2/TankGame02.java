package com.dreaMTank.tankgame;

import javax.swing.*;


/**
 * @author 林
 * @versoin 1.0
 */
public class TankGame01 extends JFrame {
    //定义MyPanel
     MyPanel mp = null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }
    public TankGame01(){
       mp = new MyPanel() ;
       this.add(mp);
       this.setSize(1000,750);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
    }
}
