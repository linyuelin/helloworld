public class RecursionExercise01{
	public static void main(String [] args) {
		
   T t1 = new T();
   int n =7;
   int res = t1.Fibonacci(n);
   if(res != -1) {
   System.out.println("当n=" + n + "时对应的斐波那契数=" + res);
   }
   }
}

class T {
	
	/*
	 * 请使用递归的方式求出斐波那契1，1，2，3，5，8，13、、、、给你一个整数n，求出他的值是多少。
	   思路分析：
	   1.当n=1，n=2时，对应的斐波那契数为1；
	   2，当n > 2时，对应的斐波那契数为（n-1） +（n + 1）
	   
	 */
	
	public int Fibonacci( int n) {
		if(n >= 1) {
		    if(n == 1 || n ==2) {
			return 1;
		   }else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		   }
		}else {
			System.out.println("请输入大于1的整数");
			return -1;
		}
	}
}