public class classHomework04{
	public static void main(String [] args) {
		A03 a = new A03();
		int oldArr[] = {1,2,3};
		int [] arr1 =a.copyArr(oldArr);
		System.out.println("==返回的数组元素情况==");
		for(int i = 0; i< arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
	}
}

class A03{
	//题目：编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样。
	
	public int[] copyArr(int []oldArr){
		
		        int [] arr1 =new int [oldArr.length];
		for(int i = 0; i < oldArr.length; i ++) {
			arr1[i]=oldArr[i];
		}
		return arr1;
		}
		}
		
		
	
