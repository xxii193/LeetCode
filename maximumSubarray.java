// Hard
// Need to finish the recursive method 
package com.test;

public class maximumSubarray {
	public int Subarray(int[] test){
		int max = Integer.MIN_VALUE;
		int result = 0;
		if (test == null || test.length == 0)
			return 0;
		for (int i = 0 ;i < test.length; i++){
			result += test[i];
		    max = result > max ? result : max;
		    result = result > 0 ? result : 0;
		   
		}
		return max;
		
	}
	
	public static void main(String[] args){
		maximumSubarray t = new maximumSubarray();
		int[] num = {-6,-5,-2,};
		System.out.println(t.Subarray(num));
	}
}
