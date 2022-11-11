import java.util.Scanner;
public class Nested01{
	public static void main(String[] args) {
		/*出票系统：
		 * 根据淡旺季的月份和年龄，打印票价
		 * 4-10旺季：成人（18-60）：60
		 *         儿童（<18）：半价
		 *         老人(>60) :1/3
		 * 淡季：
		 *        成人：40
		 *        其他：20
		 *   思路分析：
		 *   1.淡旺季if else 
		 *   2.旺季中可分成三种情况，淡季中可分成两种情况
		 *   3.走代码    
		 */
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入月份");
	int month = myScanner.nextInt();
	if(month>=4 && month<=10) {
		System.out.println("请输入年龄");
	int age1 = myScanner.nextInt();
	if(age1 >= 18 && age1<= 60) {
		System.out.println("票价为60");
	}else if(age1<18) {
		System.out.println("票价为30");
	}else if(age1 > 60) {
		System.out.println("票价为20");
	}
	}else {
		System.out.println("请输入年龄");
		int age2= myScanner.nextInt();
		if(age2 >= 18 && age2<= 60) {
			System.out.println("票价为40");
		}else {
			System.out.println("票价为20");
		}
	}
		
	}
	
}