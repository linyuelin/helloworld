public class classHomework03{
	public static void main(String [] args) {
	Book b = new Book("西游记" , 128);
	b.info();
	b.updatePrice(128);
	b.info();
	System.out.println(b.updatePrice(1));
	}
}

class Book{
	//编写类Book，定义方法updatePrice，实现更改某本书的价格，具体：如果价格> 150，则更改为150，如果价格>100，更改为100，否则不变
	
	String name;
	double price;
	
	public Book(String name , double price) {
		this.name = name;
		this.price = price;
	}
	public double updatePrice(double price) {
		if(this.price > 150) {
			this.price = 150;
		}else if(this.price > 100) {
			this.price = 100;
		}else {
			price = price;
		}
		return  this.price;
	}
	public void info() {
		System.out.println("书的名字是=" + this.name + "书的价格是=" + this.price );
	}
}