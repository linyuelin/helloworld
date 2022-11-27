//求出1-1/2+1/3-1/4.....1/100的和
//分析：
//   1. 式子为（1/1）-（1/2）+（1/3）-（1/4）....（1/100）
//    2.分子都为1，分母为1-100的数
//    3.当分子为奇数前面是+，反之为减
//    4.使用for循环+判断
  
public class whileHomework08{
	public static void main(String [] args) {
		
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				sum += 1.0 /i;
			}else {
				sum -= 1.0/i;
			}
		
		}
		System.out.println("sum=" + sum);
	}
}