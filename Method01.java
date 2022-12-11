//成员方法快速入门
// 1）、添加speak成员方法，输出我是一个好人。
// 2)、添加cal01的成员方法，可以计算从1+、、、+1000的结果。
// 3)、添加cal02成员方法，该方法可以接受一个数n,计算从1+、、、+n的结果。
// 4)、添加getsum成员方法，可以计算两个数的和。
public class Method01{
	public static void main(String [] args) {
		
	Person p1	= new Person();
	p1.speak();
	p1.cal01();
	p1.cal02(5);
	int returnSum = p1.getSum(10, 20);	
	System.out.println("getSum方法返回的值=" + returnSum);
	}
}
		
		
		
		class Person{
			String name;
			int age;
			public void speak(){
				System.out.println("我是一个好人");
			}
		
			int sum = 0;
            public void cal01() {
            	for(int i = 1; i <=1000; i++) {
            		sum += i;
            	}
            	System.out.println("cal01方法的值=" + sum);
            }
            
            public void cal02(int n){
            	int sum = 0;
            	for(int i = 1; i <= n; i++) {
            		sum += i;
            	}
            	System.out.println("cal02方法的计算结果=" + sum);
            }
            public int getSum(int num1, int num2) {
              	int sum = num1 + num2;
              	return sum;
            }
            
		}