//题目：已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序
//  比如：【10，12，45，90】添加23，【10，12，23，45，90】


public class arrHomeWork04{
	public static void main(String []args) {
		
		int arr[] = {10,12,45,90};
		int index = -1;
		int  insertNum = 23;
		for(int i = 0; i < arr.length ;i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;
			}
			if(index == -1) {
				index = arr.length;
				
			}
		}
		int [] arrNew = new int [arr.length +1];
		for(int i = 0, j = 0; i < arrNew.length; i++) {
			if(i != index) {
				arrNew[i] = arr[j];
						j++;
			}else {
				arrNew[i] = insertNum;
			}
		
		}
		arr  = arrNew;
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ "\t");	
		}
		
		
	}
}