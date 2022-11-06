public class ArithmeticOperatorExercise01 {
	//编写一定主方法
	public static void main(String[] args) {
		//需求：
		//假如还有59天放假，问：合xx个星期零几天
		//思路分析：使用　int变量 days weeks
		//输出
		
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天合" + weeks + "星期零" + leftdays + "天");
		
		
		//需求：定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度
		//思路分析
		// 先定义一个double huashi 变量保存 华氏温度
		//根据公式，进行计算即可
	    //保存结果
		double huashi = 234.6;
		double sheshi = 5.0 / 9 * (huashi -100);
		System.out.println("华氏温度" + huashi + "对应的摄氏温度=" + sheshi );
		
	}
}