//题目：将下面无序数组，24，69，80，57，13使用冒泡排序法将其排成一个从小到大的有序数列。

public class BubbleSort{
	public static void main(String [] args) {
		
		int [] arr = {24,69,80,57,13};
		int temp = 0;
		for(int i = 0; i <  arr.length - 1; i++) {
			
		for(int j = 0; j < arr.length - 1-i; j++) {
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		System.out.println("\n第" + (i + 1) + "轮排序过后");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
		}
	}
}