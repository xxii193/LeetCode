package com.test;


public class SumRootToLeaf {
public int sumNumbers(TreeNode root) {
	if (root == null){
		return 0;
		
	}else
		return recursiveTraversal(root,0);
	
    }
public int recursiveTraversal(TreeNode root, int sum){
	if(root == null){
		return 0;
	}
	
	if (root.left == null && root.right == null ){
		return root.val + 10*sum;
	}
	else{
		return recursiveTraversal(root.left,sum*10+root.val)+recursiveTraversal(root.right,sum*10+root.val);
		
	}
}

}
