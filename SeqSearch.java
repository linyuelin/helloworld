//题目：有一个数列，白眉鹰王，金毛狮王，紫山龙王，青翼蝠王。从键盘中任意输入一个名称，判断数列中是否包含此名称
//      【顺序查找】要求：如果找到了，就提示找到，并给出下标值。

import java.util.Scanner;
public class SeqSearch{
	public static void main(String [] args) {
		
		String[] names= {"白眉鹰王","金毛狮王","紫山龙王","青翼蝠王"} ;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String findName = myScanner.next();
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			
			if(findName.equals(names[i])) {
				System.out.println("名字已找到" + findName);
				System.out.println("下标为" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("sorry,没找到");
		}
		
	}
}