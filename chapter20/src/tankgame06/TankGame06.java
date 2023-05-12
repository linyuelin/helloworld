import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author 林
 * @versoin 1.0
 */
public class TankGame05 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame05 tankGame01 = new TankGame05();
    }

    public TankGame05() {
        System.out.println("1:重新开始游戏  2：继续上一局");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        mp = new MyPanel(key);

        Thread thread = new Thread(mp);
        thread.start();


        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1300, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
