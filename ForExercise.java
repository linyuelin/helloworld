//打印1～100之间的所有9的倍数的整数，统计个数及总合
public class ForExercise{
	public static void main(String[] args) {
		//编程思想：化繁为简，先死后活。
		int count = 0;//个数
		int sum =0;//总合
	    int start = 1;
	    int end   = 100;
	    int t  =  9;
		for(int i = start;i <= end;i++) {
			if (i % t == 0) {
			System.out.println("i=" + i);
			count ++;
			System.out.println("count=" + count);
	        sum +=i;//累计
	        System.out.println("sum=" + sum);
			}
			
			
	}
}}