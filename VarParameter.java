public class VarParameter{
	public static void main(String []args) {
		
		HspMethod m =new HspMethod();
		System.out.println(m.sum(3,4,5));
		
	}
}

class HspMethod{
	//可以计算2个数的和，三个数的和，4，5、、、、
	
	public int sum(int... nums) {
		System.out.println(nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		
		}
		return res;
	}
}