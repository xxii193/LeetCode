package com.test;
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
*/
public class MaximumPathSum {
   public int maxPathSum(TreeNode root) {
       if (root == null){
              return Integer.MIN_VALUE ;
       }
       int[] maxN = new int[1];
       maxN[0] = Integer.MIN_VALUE;
       Solution(root, maxN);
       return maxN[0];
      
   }
   public int Solution(TreeNode root, int[] max){
      if (root == null){
              return 0;
      }
      
      int sum ;
    
     
      int leftPath = Solution(root. left , max);
          
     
      int rightPath = Solution(root. right , max);
      
      
      sum = Math. max(root.val, Math.max(leftPath + root.val, rightPath + root.val ));
      max[0] = Math.max(max[0], Math.max(sum, leftPath + root.val + rightPath));
      return sum;
   }
   
   
   public static void main(String[] args){
	   MaximumPathSum t = new MaximumPathSum();
	   TreeNode root = new TreeNode(-2);
	   TreeNode l = new TreeNode(1);
	   root.left = l;
	   
	   System.out.println(t.maxPathSum(root));
   }
}
