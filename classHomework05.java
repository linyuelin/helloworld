public class classHomework05{
	public static void main(String [] args) {
		
		Circle  c1 =new Circle(1);
	    System.out.println("圆的周长=" + c1.len());
	    System.out.println("圆的面积=" + c1.area());
}
}
class Circle{
	//题目：定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法。
	
	double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	public double len() {
		return  2 * Math.PI * radius;
		
	}
	public double area() {
		return   Math.PI * radius * radius;
		
	}
}