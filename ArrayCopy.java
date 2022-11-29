//题目：将int【】arry1 = 【10，20，30】拷贝到arr2数组
//分析：先新建arr2，然后遍历arr1进行赋值

public class ArrayCopy{
	public static void main(String [] args) {
		int [] arr1 = {10,20,30};
		int [] arr2= new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
	}
}