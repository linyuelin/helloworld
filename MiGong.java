//老鼠出迷宫
public class MiGong{
	public static void main(String [] args) {
		
		/*
		 * 思路：
		 * 1.先创建迷宫，用二维数组 int [][] map = new int[8][7]
		 * 2.规定0为可行，1为不能走
		 * 3.设置不可行的空格
        */
		int [] [] map = new int[8][7];
		
		for(int i = 0; i < 7; i++) {
			map [0][i] = 1;
			map [7][i] = 1;
		}
		
		for(int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map [3][2] = 1;
			
			System.out.println("====迷宫现状====");
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println("");
			}
			
			HH t1 =new HH();
		      t1.findWay(map,1,1);
		      System.out.println("找路的情况如下");
		      for(int i = 0; i < map.length; i++) {
		    	  for(int j = 0; j< map[i].length;j++) {
		    		  System.out.print(map[i][j] + " ");
		    	  }
		    	  System.out.println("");
		      }
		      
	}
}
class HH{
	//思路：使用递归回溯方式解决问题
	//1.findway方法专门用来找迷宫的路径
	//2.如果找到就返回true，否则false
	//3.map为二维数组，表示迷宫
	//4.i，j就是老鼠的位置，初始位置为（1，1）
	//5，0表示可以走，1表示障碍物 2表示可以走 3表示走过，但是不通
	//6，当map【6】【5】==2，可以结束
	//7，顺序： 下 右 上 左
	
	public boolean findWay (int [] [] map, int i , int j) {
		if(map [6][5] ==  2) {
			return true;
		}else {
			if(map[i] [j] == 0) {
			map[i] [j] = 2;
			   if(findWay( map,i+1 ,j)) {
				return true;
			}else if (findWay( map,i, j+1)) {
				return true;
			}else if (findWay( map,i-1,j)) {
				return true;
			}else if (findWay( map ,i, j-1)) {
				return true;
			}else {
				map[i] [j] = 3;
				return false;
			}
			}else {
				return false;
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
