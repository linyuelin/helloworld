//题目：把数组int[] arr = {11,22,33,44,55,66}进行调转顺序
//思路：1.把arr[0]和arr[5]进行调转{66,22,33,44,55,11}
//     2.把arr[1]和arr[4]进行调转{66,55,33,44,22,11}
//     3.把arr[2]和arr[3]进行调转{66,55,44,33,22,11}
//    交换次数为3次=arr.length/2
//    arr[i] = arr[arr.length - 1 - i]

public class ArrayReverse{
	public static void main(String [] args) {
		
		int[] arr = {11,22,33,44,55,66};
		int temp = 0;
		for(int i = 0 ; i< arr.length/2; i++) {
			temp= arr[arr.length - 1 - i];
			arr[arr.length -1 -i] = arr[i];
			arr[i] = temp;
		}
		System.out.println("翻转后" );
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}