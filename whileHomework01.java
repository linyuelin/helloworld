public class whileHomework01{
	public static void main(String [] args) {
		//1.某人有100000元，每经过一次路口，需要交费，规则如下：
		// 1）当现金>50000时，每次交5%
		// 2）当现金<=50000时，每次交1000
		//编程计算该人可以经历多少次路口，要求：使用while+break方式完成
		
		//思路：1.定义 double money 保存100000
		//     2.三种情况：money>50000;
		//               money >= 1000,money <= 50000
		//               money <1000
		//     3.使用多分枝
		
		double money = 100000;
		int count    = 0;
		while(true) {
			if(money >50000) {
				money *= 0.95;
	         count++;
	         
			}else if(money >= 1000) {
				money -= 1000;
				count++;
			}else {
                break;	
 			}
		}
		System.out.println("100000元"+ "能走"+ count+ "次路口");
	}
}