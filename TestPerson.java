public class TestPerson{
	public static void main(String [] args) {
		
		
		persons p1 = new persons("jack",80);
		persons p2 = new persons("jack",90);
		System.out.println(p1.compareTo(p2));
	}
}
/*
 *定义person类，里面有name，age属性，并提供compareTo比较方法，
 *用于判断是否和另外一个人相等，提供测试类TestPerson用于测试，
 *名字和年龄完全一样，就返回true，否则返回false。
 */

class persons{
	String name;
	int age;
	
	public persons(String name, int age) {
		this.name = name;
		this .age = age;
	}
	public boolean compareTo(persons p){
		return this.name.equals(p.name) && this.age ==p.age;
	}
}