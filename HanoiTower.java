public class HanoiTower{
	public static void main(String [] args) {
		
		Tower tower = new Tower();
         tower.move(3, 'A', 'B', 'C');	
	}
}

class Tower{
	
	//移动汉诺塔
	
	public void move(int num, char a, char b, char c) {
		//如果只有一个盘
		if(num == 1) {
			System.out.println(a + "->" + c);
		}else {
			move(num-1,a,c,b);
			System.out.println(a +"->"+c);
			move(num-1,b,a,c);
		}
	}
}