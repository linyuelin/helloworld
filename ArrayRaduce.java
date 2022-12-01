//题目：有一个数组{1,2,3,4,5},可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素，当只剩最后一个时，
//      提示：不能再进行缩减。
import java.util.Scanner;
public class ArrayRaduce{
	
	public static void main(String [] args) {
		int [] arr = {1,2,3,4,5};
		Scanner myScanner = new Scanner(System.in);
		do {
			int []arrNew = new int[arr.length -1];
		for(int i = 0; i < arr.length-1; i++) {
			arrNew[i] = arr[i];
		}
		arr = arrNew;
		System.out.println("缩减最后一个数过后,当前数为");
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(  arr[i]);
	}
		System.out.println("是否继续y/n");
		char key = myScanner.next().charAt(0);
		if(key == 'n'|| arr.length==1) {
			break;
		}
		}while(true); 
	}
}