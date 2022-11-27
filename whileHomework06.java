//题目：输出1-100之间的不能被5整除的数，每5个一行
// 思路分析：
 //     1，先输出1-100的数
//      2，输出不能被5%的数
//      3，设定5个一行

public class whileHomework06{
	public static void main(String []args) {
		
		int count =0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count ++;
				if(count % 5 == 0) {
					System.out.println(" ");
				}
			}
		}
	}
}