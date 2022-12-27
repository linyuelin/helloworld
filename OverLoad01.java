//方法重载
public class OverLoad01{
	public static void main(String[] args) {
	
		myCalculate cal =new myCalculate();
		System.out.println(cal.calculate(1.3, 90));
	}
}

class myCalculate{
	public int calculate(int n1,int n2) {
		return n1+n2;
	}
	public double calculate(int n1, double n2) {
		return n1+ n2;
	}
	public double calculate(double n1, int n2) {
		System.out.println("调用的是public double calculate(double n1, int n2)这个方法");
		return n1 + n2;
	}	
	public int calculate(int n1, int n2, int n3) {
		return n1+ n2+ n3;
	}
	
	
	
}