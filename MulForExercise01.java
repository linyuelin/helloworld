import java.util.Scanner;

public class MulForExercise01{

	public static void main(String [] args) {
		//统计3个班成绩情况，每个班有5名同学
		//求出各个班的平均分和所有班级的平均分（学生的成绩从键盘输入）。
		//统计三个班及格人数，每个班有5名同学。
		
		
		//思路分析：
		//化繁为简
		//1.先计算一个班，5个学生的成绩，使用for
		// 1.1求出平均分，先得到总分，再除以人数
		//2.计算所有班的平均分
		//  2.1先得到各个班的分数及总合,设置总合totalScore
		//3.计算及格人数
		//  3.1如果分数大于等于60，则加1
		
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int pass = 0;
		for(int i = 1; i <= 3; i++) {
		    double sum = 0;
		   for(int j=1;j<=5;j++) {
		    System.out.println("请输入第"+i+"班,第"+j+"个同学成绩");
		    double score = myScanner.nextDouble();
		    if(score >= 60) {
		    	pass ++;
		    }
		    sum += score;
		    System.out.println("成绩是"+ score);
		}
		System.out.println("平均分为"+ sum/5);
		totalScore += sum;
		    
		}
		 System.out.println("三个班总分为"+ totalScore+ "平均成绩为"+ (totalScore/15));
		 System.out.println("合格人数有"+ pass+"个");
	}
}