import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args) {
		
		/**
		 * 使用switch把小写类型的char型转为大写（键盘输入）。只转换a,b,c,d,e.其他的输出“other。
		 */
		     //思路分析：
		    //1.接受一个字符，创建Scanner对象
			//2.使用switch完成匹配，并输出对应信息
           Scanner myScanner = new Scanner(System.in);
           System.out.println("请输入a~e");
           char letter = myScanner.next().charAt(0);
           switch(letter) {
           case 'a':
        	   System.out.println("A");
            break;
           case'b':
        	   System.out.println("B");
        	 break;
           case 'c':
        	   System.out.println("C");
        	 break;
           case 'd':
        	   System.out.println("D");
        	  break;
           case 'e':
        	   System.out.println("E");
        	  break;
        	default:
        	   System.out.println("other");
        	   
        	   
        	   //对学生成绩大于60分的，输出“合格”，低于60分的，输出“不合格”。（注：输入的成绩不能大于100）
        	   //1.使用switch
        	   //2.这里需要转换
        	   //  如果成绩在[60,100],(int)(成绩/60）=1
        	   //  如果成绩在[0,60),(int)(成绩/60）=0
        	   double score = 99;
        	   if(score >=0 && score <=100) {
        	  switch ((int)(score/60)) {
        	  case 0:
        		  System.out.println("不合格");
        		  break;
        	  case 1:
        		  System.out.println("合格");
        		  break;
        	  }
        	   }else {
        		   System.out.println("输入的成绩在0-100");
        		  
        		   
        		   
        		   
        		   
        	  }
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
               
           }
	}
}