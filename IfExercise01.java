public class IfExercise01{
	public static void main(String[] args ){

	double a = 15.0;
	double b = 16.0;

	if(a>10.0 && b<20.0){
	System.out.println("两个数的和="+(a+b));


    int c1 =10;
    int c2 =5;
    int c3 =c1 + c2;
    if(c3 % 3==0 && c3 % 5 ==0){
    System.out.println("能整除");

    }else{
    System.out.println("不能整除");
    
    //判断一个年份是否是闰年，闰年的条件符合下面二者之一：
    //1.年份能被4整除，但不能被100整除；2能被400整除
    //思路分析
    //1.定义int year
    //2.年份能被4整除，但不能被100整除；
    
    int year = 2004;
    if((year % 4 ==0 && year % 100 != 0)|| year % 400 == 0 ){
    	System.out.println("闰年");
    }else {
    	System.out.println("不是闰年");
    }
    
    
    
    
    }
}
}
}