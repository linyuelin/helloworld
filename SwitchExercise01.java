import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args) {
		
		//根据指定月份，打印该月份所属的季节，3，4，5春季；6，7，8夏季；9，10，11秋季；12，1，2冬季
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份1～12");
		int month = myScanner.nextInt();
		
		switch(month){
		case 3:
		case 4:
		case 5:
		System.out.println("春季");
        break;
		case 6:
		case 7:
		case 8:
		System.out.println("夏季");
		break;
		case 9:
		case 10:
		case 11:
		System.out.println("秋季");
		break;
		case 12:
		case 1:
		case 2:
		System.out.println("冬季");
		break;
		default:
		System.out.println("输入有误，请输入1～12");
		
		}
	}
}