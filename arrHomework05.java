//题目：随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值，求最大值和最大值的下标，
//     并且查找里面是否有8
//思路：
//1.随机设立一个数组arr，用泡沫排序法排出倒序
//2.遍历最开始一个数为最大值，并记忆其下标
//3.查找有没有等于8的值

public class arrHomework05{
	public static void main(String [] args) {
	
		int [] arr = new int[10];
		for(int i= 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random() * 100)+1;
			
		}
		System.out.println("arr的元素情况");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
			
		}
		int sum = 0;
		System.out.println("倒序的元素如下");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("平均值为" + (sum/arr.length));
		
		 int maxindex = 0;
		 int findMax = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(findMax < arr[i]) {
				findMax = arr[i];
				maxindex = i;
			}
		}
		System.out.println("最大值为"+ findMax);
		System.out.println("最大值下标为"+ maxindex);
		
		int index = -1;
		int findNum = 8;
		for(int i = 0; i < arr.length; i++) {
			if(findNum == arr[i]) {
			System.out.println("有");
			index = i;
			break;
		}
			
			}
	
		if(index == -1) {
			System.out.println("没有");
}}
}