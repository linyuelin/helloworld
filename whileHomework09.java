// 求1+（1+2）+（1+2+3）+（1+2+3+4）+.....+(1+2+3+...100)的结果
//分析：1.（1）+（1+2）+（1+2+3）+(1+2+3+4)
//        每次最后一位加1，填入最后一个数

 public class whileHomework09{
	 public static void main(String [] args) {
		int sum = 0;
		 for(int i = 1; i <= 100; i++) {
			 for(int j =1; j <= i; j++) {
				sum += j;
			 }
	
		 }
		 System.out.println(sum);
	 }
 }