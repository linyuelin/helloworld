//题目：把数组int[] arr = {11,22,33,44,55,66}进行调转顺序
//方法二：逆向赋值，新建一个arr2

public class ArrayReverse01{
	public static void main(String[] args) {
		
	/*	int [] arr1 = {11,22,33,44,55,66};
		int [] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[arr1.length - 1 - i] = arr1[i];
			
		}
		
		for(int i = 0 ; i < arr1.length; i++) {
	  System.out.println(arr2[i]);
	}   */
		int [] arr = {11,22,33,44,55,66};
		int [] arr1 = new int[arr.length];
	
		for(int i = arr.length -1, j= 0;i >= 0; i--,j++) {
			arr1 [j] = arr [i];
		}
		arr = arr1;
	  for(int i = 0 ; i < arr.length; i ++) {
		  System.out.println(arr[i]);
	  }
}
}