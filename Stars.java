public class Stars{
	public static void main(String[] args) {
		/*打印   *
		       * *
		      *   *
		     *     *
		    *********  
		    */
		//思路分析：
		/*1.先打印
		    *****
		    *****
		    *****
		    *****
		    */
		
		/*2.打印
		   *
		   **
		   ***
		   ****
		   *****
		 */
		/*3.打印
		    *           2*1—1              
		   ***          2*2-1
		  *****         2*3-1
		 *******
		*********
		  
		 */
		/*4.打印
		     *
		    * *
		   *   *
		  *     *
		 *********  
		   
		  5.先死后活
		  定义一个变量 int totallevel = 5;
		  
		  
		 */
		int totallevel = 5;
		for(int i = 1;i <= totallevel;i++) { //i表示层数
			//打印空格
			for(int k = 1;k <= totallevel-i;k++ ) {
			System.out.print(" ");
			}
			//控制打印每层*的个数
			for(int j = 1;j <= 2*totallevel-1;j++) {
				if(j == 1 || j == 2 * i - 1 || i== totallevel) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			
		}
	}
}