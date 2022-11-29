//题目：循环输入5个成绩，保存到double数组，并输出

import java.util.Scanner;
public class Array02{
	public static void main(String [] args) {
		
		double[] scores =new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores .length; i++) {
			System.out.println("请输入第"+ (i + 1)+"个成绩");
			  scores[i]= myScanner.nextDouble();
			
			}
		
		 System.out.println("输入成绩如下");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("第"+ (i+1)+"个成绩为" + scores[i]);
		}
	}
}