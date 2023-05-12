import java.util.Vector;

/**
 * @author 林
 * @versoin 1.0
 */

@SuppressWarnings("all")
public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    Vector<EnemyTank> enemyTanks = new Vector<>();

    boolean isLive = true;

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    public boolean isTouchEnemyTank() {
        switch (this.getDirect()) {
            case 0://上
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {//如果该坦克不是比较的自己

                        //如果比较的坦克方向是上下 范围是 x  enemyTank.getX(), enemyTank.getX()+40
                        //                          y   enemyTank.getY(),  enemyTank.getY()+60

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克左上角坐标 this.getX(),this.getY()
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //当前坦克右上角坐标 this.getX()+40,this.getY()

                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果比较的坦克方向是左右 范围是 x  enemyTank.getX(), enemyTank.getX()+60
                        //                          y   enemyTank.getY(),  enemyTank.getY()+40

                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {//如果比较的坦克方向是左右
                            //当前坦克左上角坐标 this.getX(),this.getY()
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //当前坦克右上角坐标 this.getX()+40,this.getY()

                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1://右
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {//如果该坦克不是比较的自己

                        //如果比较的坦克方向是上下 范围是 x  enemyTank.getX(), enemyTank.getX()+40
                        //                          y   enemyTank.getY(),  enemyTank.getY()+60

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克上角坐标 this.getX()+60,this.getY()
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //当前坦克下角坐标 this.getX()+60,this.getY()+40

                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果比较的坦克方向是左右 范围是 x  enemyTank.getX(), enemyTank.getX()+60
                        //                          y   enemyTank.getY(),  enemyTank.getY()+40

                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {//如果比较的坦克方向是左右
                            //当前坦克上角坐标 this.getX()+60,this.getY()
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //当前坦克下角坐标 this.getX()+60,this.getY()+40

                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2://下
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {//如果该坦克不是比较的自己

                        //如果比较的坦克方向是上下 范围是 x  enemyTank.getX(), enemyTank.getX()+40
                        //                          y   enemyTank.getY(),  enemyTank.getY()+60

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克左角坐标 this.getX(),this.getY()+60
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //当前坦克右角坐标 this.getX()+40,this.getY()+60

                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果比较的坦克方向是左右 范围是 x  enemyTank.getX(), enemyTank.getX()+60
                        //                          y   enemyTank.getY(),  enemyTank.getY()+40

                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {//如果比较的坦克方向是左右
                            //当前坦克左角坐标 this.getX(),this.getY()+60
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //当前坦克右角坐标 this.getX()+40,this.getY()+60

                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3://左
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {//如果该坦克不是比较的自己

                        //如果比较的坦克方向是上下 范围是 x  enemyTank.getX(), enemyTank.getX()+40
                        //                          y   enemyTank.getY(),  enemyTank.getY()+60

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克上角坐标 this.getX(),this.getY()
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //当前坦克下角坐标 this.getX(),this.getY()+40

                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果比较的坦克方向是左右 范围是 x  enemyTank.getX(), enemyTank.getX()+60
                        //                          y   enemyTank.getY(),  enemyTank.getY()+40

                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {//如果比较的坦克方向是左右
                            //当前坦克上角坐标 this.getX(),this.getY()
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //当前坦克下角坐标 this.getX(),this.getY()+40

                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;

        }
        return false;
    }


    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {

        while (true) {

            //判断如果子弹size = 0，并且坦克活着就再次画一颗子弹
            if (isLive && shots.size() < 1) {
                Shot s = null;
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }

            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    break;

            }

            setDirect((int) (Math.random() * 4));


            if (!isLive) {
                break;
            }
        }

    }
}
