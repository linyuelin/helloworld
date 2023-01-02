public class classHomework13{
	public static void main(String [] args) {
		Circles c =new Circles();
		passObject po = new passObject();
		po.printAreas(c, 5);
		
		
		
	}
}
class Circles{
	/*
	 * 题目：将对象作为参数传递给方法。
	 * 要求；1，定义一个circle类，包含一个double型的radius属性代表圆的半径，findarea（）方法返回圆的面积；
	 *      2，定义一个类passobject，在类中定义一个方法printareas（），该方法的定义如下：
	 *        public void printAreas(circle c , int times)
	 *      3,在printareas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。例如：times为5，则
	 *      输出半径1，2，3，4，5以及对应的圆面积。
	 *      4，在main方法中调用printareas（）方法，调用完毕后输出当前半径值。程序运行结果如图所示。
	 */
	
	double radius;
	public Circles() {
		
	}
	
	public Circles(double radius) {
		this.radius= radius;
	}
	public double findArea() {
		return   Math.PI * radius * radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class passObject{
	public void printAreas(Circles c,int times) {
		double area = 0;
		for(double i = 1; i <=times;i++) {
			System.out.println("Radius" + "\t " + "Area");
	        c.setRadius(i);
	        System.out.println(i+"\t" + c.findArea());
			}
		
	
	}
}