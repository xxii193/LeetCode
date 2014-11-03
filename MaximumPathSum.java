package com.programing;


public class MaximumPathSum {
    public int maxPathSum(TreeNode root, int max) {
        if (root == null){
        	return Integer.MIN_VALUE;
        }
        int sum = 0;
        return Solution(root, sum);
        
    }
    public int Solution(TreeNode root, int Sum){
    	if (root == null){
    		return 0;
    	}
    	int left = 0;
    	int right = 0;
    	if (root.left != null){
    		left = Solution(root.left , Sum) > 0 ? Solution(root.left , Sum) : 0;
    		
    	}
    	if (root.right != null){
    		right = Solution(root.right , Sum) > 0 ? Solution(root.right , Sum) : 0;
    	}
    	
    	Sum = Math.max(left+root.val, right+root.val);
    	return Sum;
    }
}
