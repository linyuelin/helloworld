import java.io.*;
import java.util.Vector;

/**
 * @author 林
 * @versoin 1.0
 */
public class Recorder {
    private static int allEnemyTankNum;
    private static BufferedWriter br = null;
    private static BufferedReader bd = null;
    private static String recordFile = "/Users/apple/myRecord.txt";
    private static Vector<EnemyTank> enemyTanks = null;
    private static Vector<Node> nodes = new Vector<>();

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static void addAllEnemyTankNum() {
        allEnemyTankNum++;
    }

    public static Vector<Node> getNodesAndEnemyTankNumRec() {
        String readLine = "";
        try {
            bd = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(bd.readLine());

            while ((readLine = bd.readLine()) != null) {
                String[] s = readLine.split(" ");
                Node node = new Node(Integer.parseInt(s[0]), Integer.parseInt(s[1]),Integer.parseInt(s[2]));
                nodes.add(node);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bd != null) {
                try {
                    bd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return nodes;
    }

    public static void keepRecord() {
        try {
            br = new BufferedWriter(new FileWriter(recordFile));
            br.write(allEnemyTankNum + "\r\n");//+"\r\n"
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {
                    br.write(enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect() + "\r\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
