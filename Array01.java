//题目：一个养鸡场有6只鸡，他们的体重分别是3，5，1，3.4，2，50千克，请问这六只鸡的总体重是多少？
//      平均体重是多少？请你编写一个程序。
// 思路：传统方式，定义6个变量
  public class Array01{
	  public static void main(String[] args) {
		  
		/* double hen1 = 3;
		 double hen2 = 5;
		 double hen3 = 1;
		 double hen4 = 3.4;
		 double hen5 = 2;
		 double hen6 = 50;
		 double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 +hen6;
		 System.out.println("总体重为" + totalWeight + "平均体重为" + (totalWeight / 6));
		 */
		 
//使用数组方式
		 double [] hens = {3,5,1,3.4,2,50};
		 System.out.println("数组的长度=" + hens.length);
		 
		 double totalWeight = 0;
		 for(int i = 0; i < 6; i++) {
			 totalWeight += hens[i];
      
		 }
		 System.out.println("总体重为" + totalWeight + "平均体重为" + (totalWeight / 6));
	  }
  }
 