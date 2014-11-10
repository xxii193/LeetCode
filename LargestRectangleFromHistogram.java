package com.test;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleFromHistogram {
	 public int largestRectangleArea(int[] height) {
		    if (height == null || height.length == 0)
	        	return 0;
	    	int length = height.length;
	    	int[] rec = new int[length + 1];
	    	rec = Arrays.copyOf(height, length + 1);
	        Stack<Integer> stack = new Stack<Integer>();
	        stack.push(0);
	        int max = rec[0];
	         
	        for(int m = 1; m <= length; m++){
	        	if(stack.empty() || rec[m] >= rec[stack.peek()]){
	        		stack.push(m);
	        	}
	        	else{
	        		int tmp = stack.peek();
	        		stack.pop();
	        		int maxLeft = rec[tmp]*(stack.empty()?(tmp + 1):(tmp - stack.peek()));
	        		int maxRight = rec[tmp]*(m - tmp - 1);
	        		max = Math.max(max, maxLeft + maxRight);
	        		m--;
	        		
	        	}
	        }

	        return max;
	 }
}
