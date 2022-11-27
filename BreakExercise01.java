//题目：1-100以内的数字和，求出当和第一次大于20的当前数【for+break】
//分析：1.先打出1-100
//     2.定义一个变量sum，然后求和。
//     3.当sum大于20时，跳出
public class BreakExercise01{
	public static void main(String [] args) {
		int n = 0;
		int sum = 0;
		for(int i = 1; i <= 100 ; i ++) {
		sum += i;
		if(sum > 20) {
			System.out.println("和大于20");
			n = i;
			break;
		}
		}
		System.out.println("当前数为" + n);
		
	}
}