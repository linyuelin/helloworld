public class RecursionExercise02{
	public static void main(String [] args) {
		
		 A t1 = new A();
		 int peachNum = 0;
		 int day = 9;
		 if(day != -1) {
		 peachNum = t1.peach(day);
		 System.out.println("当第" + day + "天时，对应的桃子数为" + peachNum);
		 }
		 }
}

class A{
	
	/*
	 * 猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个，
	 * 以后每天猴子都吃其中的一半，然后再多吃一个。当到第十天时，想再吃，发现
	 * 只有一个桃子了。问题：最初共多少个桃子？
	   思路：
	   1.day 10 = 1
	   2.day 9 = (day 10+ 1)* 2
	   3.day 8 = (day 9 + 1) * 2
	 */
	
	public int peach(int day) {
		if(day == 10) {
			return 1;
		}else if (day >= 1 && day <= 9) {
			return (peach (day+1)+1) * 2;
		}else {
			System.out.println("请输入1～10的天数");
			return -1;
		}
	}
}