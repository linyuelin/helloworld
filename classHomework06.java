public class classHomework06{
	public static void main(String [] args) {
		cale c =new cale(4,0);
		System.out.println("和=" + c.Sum());
		System.out.println("差=" + c.minus());
		System.out.println("乘=" + c.mul());
		Double resDiv = c.div();
		if ( resDiv != null) {
		System.out.println("商=" + resDiv);
		}
	}
}
class cale{
	
    //编程创建一个cale计算类，在其中定义两个变量表示两个操作数，定义四个方法实现求和，差，乘，商
	//（要求除数为0的话，要提示）并创建两个对象，分别测试。
	double num1;
	double num2;
	public cale(double num1, double num2) {
		this.num1 = num1;
		this.num2 =num2;
	}
	
	public double Sum() {
      return num1 + num2;	
	}
	public double minus() {
		return num1 - num2;
	}
	public double mul() {
		return num1 * num2;
	}
	public Double div() {
		if(num2 == 0) {
			System.out.println("nmu2不能为0");
			return null;
		}else {
			return num1 / num2;
		}
}
	}
