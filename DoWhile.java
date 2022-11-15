import java.util.Scanner;
//演示dowhile
public class DoWhile{
	public static void main(String [] args) {
		//输出十句“你好”
		
		/*int i = 1;
		do {
			System.out.println("你好");
			i++;
		}while(i <= 10);
			*/     
		 
		
		//打印1-100,并计算总合
		/*int i = 1;
		int sum = 0;
		do {
			System.out.println(i);
			i++;
			sum += i;
			System.out.println("sum=" + sum);
		}while(i <= 100);
		*/
		
		
		//统计1-200之间能够被5整除但不能被3整除的个数
	 /*   int i = 1;
		int count = 0;
		do {
			System.out.println(i);
			i++;
			if(i % 5 == 0 && i % 3 !=0) {
			count++;
			System.out.println("count=" + count);
			}
		}while (i <= 200);
		*/
		
		//如果李三不还钱，则老韩将一直使用五连鞭，直到李三说还钱为止
		//思路：
		//化繁为简
		//1.不停问“还钱吗
		//2.使用char answer 接受
		//
		Scanner myScanner =new Scanner(System.in) ;
		char answer = ' ';
		do {
			System.out.println("老韩使用五连鞭");
			System.out.println("老韩问：还钱吗？y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		}while(answer != 'y');
		
		
				  
	    
		
		
		
	}
}
