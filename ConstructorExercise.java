public class ConstructorExercise{
	public static void main(String [] args) {
		
		perso p1 = new perso(); 
		System.out.println("p1的信息name=" + p1.name + "age=" + p1.age);
		perso p2 = new perso("jack",50); 
		System.out.println("p2的信息name=" + p2.name + "age=" + p2.age);
	}
}

class perso{
	String name;
	int age;
	
	/*
	 * 定义两个构造器：
	 * 第一个无参构造器：利用构造器设置所有人的age属性初始值都为18；
	 * 第二个带pname和page两个参数的构造器：使得每次创建person对象的同时初始化对象的age属性值和name属性值。
	 */
	public perso() {
		age = 18;
	}
	public perso (String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}