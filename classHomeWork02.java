public class classHomeWork02{
	public static void main(String[] args) {
		String arr[] = {"jack", "rose","james","kobe"};
		A02 a = new  A02();
		int res = a.find(arr, "james");
		if(res != -2) {
		System.out.println("索引=" + res);
		
	}else {
		System.out.println("输入有误，数组不能为null，或者{}");
	}
}
}

class A02 {
	
	//编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引，如果找不到，返回-1.
	public int find(String strs [], String str) {
		if(strs != null && strs.length > 0) {
		for(int i = 0; i < strs.length; i++) {
			if(str.equals(strs[i])) {
				return i;
			}
		}
				return -1;
			
	}else {
		return -2;
	}
}
}

