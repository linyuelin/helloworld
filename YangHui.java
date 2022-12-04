//题目：使用二维数组打印一个10行杨辉三角
/*      1
 *      1 1
 *      1 2 1
 *      1 3 3 1
 *      1 4 6 4 1
 *      1 5 10 10 5 1
 *      .....
 *      思路：1.第一行为1，第n行为n
 *           2.每行第一个为1，最后一个也是1
 *           3.每行非头尾的数（中间的数）为 arr[ i-1][j]+ arr[i-1][j-1]
 */
   public class YangHui{
	   public static void main(String []args) {
		   
		   int [][]YangHui = new int[10][];
		   for(int i = 0; i < YangHui.length; i++) {
			   YangHui[i] = new  int [i + 1];
			 for(int j = 0; j < YangHui[i].length ; j++) {
				 if (j == 0 || j== YangHui[i].length - 1 ) {
					 YangHui[i][j] = 1;
				
				 }else {
					 YangHui[i][j] = YangHui[i - 1][j] + YangHui[i - 1][j - 1];
				 }
			 }
			   
		   }
		   for(int i = 0; i < YangHui.length ; i++) {
			   for (int j = 0; j<  YangHui[i].length ;j++) {
				   System.out.print(YangHui[i][j] + "\t");
			   }
			   System.out.println(" ");
		   }
	   }
   }