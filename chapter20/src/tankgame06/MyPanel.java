import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 林
 * @versoin 1.0
 * 坦克大战绘图区域
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();
    Vector<Node> nodes = null;

    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    int enemyTanksSize = 3;

    public MyPanel( String key) {

        hero = new Hero(500, 100);//初始化自己的坦克
        hero.setSpeed(5);
        Recorder.setEnemyTanks(enemyTanks);


        //初始化敌人坦克
        switch (key) {
            case "1":
                for (int i = 0; i < enemyTanksSize; i++) {
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(2);
                    new Thread(enemyTank).start();

                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, 2);
                    new Thread(shot).start();
                    enemyTank.shots.add(shot);
                    enemyTanks.add(enemyTank);
                }


                break;
            case "2":
                nodes = Recorder.getNodesAndEnemyTankNumRec();
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    EnemyTank enemyTank = new EnemyTank(node.x, node.y);
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(node.direct);
                    new Thread(enemyTank).start();

                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, 2);
                    new Thread(shot).start();
                    enemyTank.shots.add(shot);
                    enemyTanks.add(enemyTank);
                }


                break;
            default:
                System.out.println("输入有误");
        }
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_3.gif"));
    }

    //编写方法，显示我方击毁坦克数
    public void showInfo(Graphics g){
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("您累计击毁敌方坦克",1020,30);
        drawTank(1020,60,g,0,0);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getAllEnemyTankNum()+"",1080,100);

    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色

        showInfo(g);

        //编写方法，画出坦克
        if(hero != null &&hero.isLive ) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }

        //绘制子弹
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isAlive) {
                g.draw3DRect(shot.x, shot.y, 1, 1, false);
            } else {
                hero.shots.remove(shot);
            }
        }

        //绘制炸弹
        for (int i = 0; i < bombs.size(); i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {

            }
            Bomb bomb = bombs.get(i);

            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);

            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);

            }

            bomb.lifeDown();
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        //drawTank(hero.getX()+100,hero.getY(),g,0,1);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);

            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);

                    if (shot.isAlive) {
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }


                }
            }
        }
    }


    /**
     * @param x      坦克左上角横坐标
     * @param y      坦克左上角众坐标
     * @param g      画笔
     * @param direct 坦克方向
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1://自己坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向绘制坦克
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 30);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }


    }


   public void hitEnemyTank(){
       for (int j = 0; j < hero.shots.size(); j++) {
           Shot shot = hero.shots.get(j);
           if (shot != null && shot.isAlive) {
               for (int i = 0; i < enemyTanks.size(); i++) {
                   EnemyTank enemyTank = enemyTanks.get(i);
                   hitTank(shot, enemyTank);
               }
           }
       }
    }
    public void hitHero() {

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (hero.isLive && shot.isAlive) {
                     hitTank(shot,hero);
                }
            }
        }
    }


        public void hitTank (Shot s, Tank tank){
            switch (tank.getDirect()) {
                case 0:
                case 2:

                    if (s.x > tank.getX() && s.x < tank.getX() + 40
                            && s.y > tank.getY() && s.y < tank.getY() + 60) {
                        s.isAlive = false;
                        tank.isLive = false;

                        enemyTanks.remove(tank);
                        if(tank instanceof  EnemyTank){
                            Recorder.addAllEnemyTankNum();
                        }
                        Bomb bomb = new Bomb(tank.getX(), tank.getY());
                        bombs.add(bomb);
                    }
                    break;
                case 1:
                case 3:
                    if (s.x > tank.getX() && s.x < tank.getX() + 60
                            && s.y > tank.getY() && s.y < tank.getY()) {
                        s.isAlive = false;
                        tank.isLive = false;
                        enemyTanks.remove(tank);
                        if(tank instanceof  EnemyTank){
                            Recorder.addAllEnemyTankNum();
                        }
                        Bomb bomb = new Bomb(tank.getX(), tank.getY());
                        bombs.add(bomb);
                    }
                    break;
            }
        }

        @Override
        public void keyTyped (KeyEvent e){

        }

        @Override
        public void keyPressed (KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_W) {
                hero.setDirect(0);
                if (hero.getY() > 0) {
                    hero.moveUp();
                }
            } else if (e.getKeyCode() == KeyEvent.VK_D) {
                hero.setDirect(1);
                if (hero.getX() + 60 < 1000) {
                    hero.moveRight();
                }
            } else if (e.getKeyCode() == KeyEvent.VK_S) {
                hero.setDirect(2);
                if (hero.getY() + 60 < 750) {
                    hero.moveDown();
                }
            } else if (e.getKeyCode() == KeyEvent.VK_A) {
                hero.setDirect(3);
                if (hero.getX() > 0) {
                    hero.moveLeft();
                }
            }

            if (e.getKeyCode() == KeyEvent.VK_J) {
                //发一颗
//           if(hero.shot == null || !hero.shot.isAlive)
//            hero.shotEnemyTank();
//        }

                hero.shotEnemyTank();
            }
            this.repaint();
        }

        @Override
        public void keyReleased (KeyEvent e){

        }

        @Override
        public void run () {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                for (int j = 0; j < hero.shots.size(); j++) {
                    Shot shot = hero.shots.get(j);
                    if (shot != null && shot.isAlive) {
                        for (int i = 0; i < enemyTanks.size(); i++) {
                            EnemyTank enemyTank = enemyTanks.get(i);
                            hitTank(shot, enemyTank);
                        }
                    }
                }
                hitEnemyTank();
                hitHero();


                this.repaint();
            }
        }


    }

