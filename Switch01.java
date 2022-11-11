import java.util.Scanner;
public class Switch01{
	public static void main(String[] args) {
		/*
		 * 案例：编写一个程序，该程序可以接受一个字符，比如：“abc"
		 * a表示周一，b表示周二，c表示周三
		 * 根据用户的输入显示相应的信息，要求使用switch语句完成
		 */
		
		//思路分析：
		//1.接受一个字符，创建Scanner对象
		//2.使用switch完成匹配，并输出对应信息
		
	 Scanner myScanner = new Scanner(System.in);
	 System.out.println("请输入“a~c");
	 char c1 = myScanner.next().charAt(0);
	 switch(c1) {
	 case'a':
		 System.out.println("今天是星期一");
		 break;
	 case'b':
		 System.out.println("今天是星期二");
	     break;
	 case'c':
		 System.out.println("今天是星期三");
		 break;
	 default:
	 System.out.println("你输入的字符不正确，无匹配");
	 }
	System.out.println("退出了switch,继续执行");
	
	}
	
}