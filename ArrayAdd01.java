//题目：实现动态的给数组添加元素效果，实现对数组扩容。
//1.原始数组使用静态分配， int[] arr = {1,2,3}
//2.增加元素，直接放在数组的最后 arr = {1,2,3,4}
//3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？ y/n

import java.util.Scanner;
public class ArrayAdd01{
	public static void main(String [] args) {
		
		int[] arr = {1,2,3};
		Scanner myScanner = new Scanner(System.in);
		do {
		int[]arrNew = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];}
		System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();
			arrNew[arrNew.length -1] = addNum;
	   arr =arrNew ;
	   
	   for(int i = 0; i < arr.length; i++) {
		   System.out.print( "当前为" +arr[i]+ "\t");
	   }
	      System.out.println("是否继续添加y/n");
		   char key = myScanner.next().charAt(0);
		   if(key =='n' ) {
			   break;
		   }
	   
		
		
		}while(true);
	}
}