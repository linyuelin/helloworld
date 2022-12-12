public class MethodExercise01{
	public static void main(String [] args) {
	AA a = new AA();
	if(a.isOdd(9)) {
		System.out.println("是奇数");
	}else {
		System.out.println("是偶数");
	}
	a.printChar(4,4,'#');
	}
}
		

//编写类AA，有一个方法：判断一个数是奇数还是偶数，返回boolean。
//根据行、列、字符打印对应行数和列数的字符，
//比如：行：4，列：4，字符：#，则打印相应的效果。
/*
     ####
     ####
     ####
     ####
 */
//思路分析：
//1.方法的返回类型   void
//2.方法的名字 printChar
//3.方法的形参（int row, int column, char c)
//4.方法体 循环
class AA{
	public boolean isOdd(int num){
		return num % 2 != 0;
	}
	
	public void printChar(int row, int column, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j< column ; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}