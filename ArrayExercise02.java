//请求出一个数组int【】的最大值【4，-1，9，10，23】，并得到对应下标。
//思路：1.先定义一个int数组
//     2，假定第一个数最大
//     3.分别和其他数对比

public class ArrayExercise02{
	public static void main(String [] args) {
		
		int [] arr = {4,-1,9,10,23};
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max =arr[i];
				maxIndex = i;
				
			}
		}
		System.out.println("最大值为"+ max + "下标为" +maxIndex );
	}
	}
