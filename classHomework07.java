public class classHomework07{
	public static void main(String[] args) {
		
		Dogs dog1 = new Dogs("子弹","米白色",1);
		System.out.println(dog1.show());
	}
}

class Dogs{
	//设计一个dog类，有名字，颜色和年龄属性，定义输出方法show（）显示其信息。
	//并创建对象，进行测试，【提示 this.属性】
	String name;
	String col;
	int age;
	
	public Dogs(String name, String col, int age) {
		this.name = name;
		this.col = col;
		this.age = age;
	}
	public String show() {
		return name + col  + "age";
		
	}
	}
