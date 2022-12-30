public class classHomeWork01{
	public static void main(String [] args) {
		A01 a = new A01();
		double [] arr = {30.0,90.7,88.2};
		Double res = a.max(arr);
		if (res != null){
			System.out.println("arr的最大值=" + res);
		}else {
			System.out.println("arr的输入有误,数组不能为null，或者{}");
		}
	}
}


class A01{
	
	//编写类A01，定义方法max，实现求某个double数组的最大值，并返回。
	
	/*public double max(double []arr){
		double temp = 0;
		for(int i = 0; i< arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j] ;
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return arr[arr.length-1];
	}}
		//return 1.1;		
		//	}
		//}
	//}
	 */
	 public Double max(double [] arr) {
		 if(arr != null &&arr.length > 0) {
			 double max = arr[0];
		 
		 for(int i = 1; i < arr.length; i++) {
			 
			 if(max < arr[i]) {
				 max = arr[i]; 
			 }
		 }
		 return max;
	 }else {
		 return null;
	 }
	
	 }
}
	
	
	
	
	
	
	

	
