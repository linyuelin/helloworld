public class classHomework12{
	public static void main(String[] args) {
		new Employee("jack","男",18);
		
	}
}

class Employee{
	
	//题目：创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），提供三个构造器方法，可以初始化
	//（1）（名字，性别，年龄，职位，薪水） （2）（名字，性别，年龄） （3）（职位，薪水），要求充分复用构造器。
	String name;
	String Gender;
	int age;
	String position;
	int sal;
     
	

	
	public Employee(String position,int sal) {
		this.position = position;
		this.sal = sal;
	}
	public Employee(String name,String Gender,int age) {
		this.name= name;
		this.Gender= Gender;
		this.age = age;
	}
	public Employee(String name,String Gender,int age,String position,int sal) {
		this(name,Gender,age);
		this.position = position;
		this.sal = sal;
	}
}
