//题目：判断一个整数是否是水仙花数，所谓水仙花数是指一个三位数，其各个位上数字立方和等于其本身。
//     例如：153=1*1*1+3*3*3+5*5*5

// 分析：设定变量int n1 = 153
//      int n2 = n1 / 100
//      int n3 = n1 % 100 / 10
//      int n4 = ni % 10
 //    if else判断

 public class whileHomework04{
	 public static void main(String [] args) {
		 int n1 = 153;
		 int n2 = n1 / 100;
		 int n3 = n1 % 100 / 10;
		 int n4 = n1 % 10;
		 if(n2 * n2 * n2 + n3 * n3 * n3 + n4 * n4* n4 ==n1) {
			 System.out.println("是水仙花数");
		 }else {
			 System.out.println("不是水仙花数");
		 }
	 }  
 }