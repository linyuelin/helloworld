public class VarParameterExercise{
	public static void main(String [] args) {
		
		H m = new H();
		System.out.println(m.showScore("小明", 80,90));
		System.out.println(m.showScore("小张", 80,90,100));
		System.out.println(m.showScore("小李", 80,90,100,100));
	}
}

class H{
	
	/*
	 * 有三个方法，分别实现返回姓名和两门成绩（总分），返回姓名和三门课成绩，返回姓名
	 * 和四门课成绩。封装成一个可变参数的方法。
	 */
	
	public  String showScore(String name, double... scores) {
		double res = 0;
		for(int i = 0; i < scores.length; i++) {
			res += scores[i];
			
		}
		return name +scores.length+ "门课成绩总分为=" + res;
	}
}