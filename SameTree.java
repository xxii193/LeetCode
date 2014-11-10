package com.test;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p == null && q == null)
    		return true;
        if(p == null && q !=null)
        	return false;
        if(p != null && q ==null)
        	return false;
        if(p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
        	return true;
        else
        	return false;
        
    }
    
    public static void main(String[] args){
    	TreeNode tree1 = null;
    	TreeNode tree2 = new TreeNode(0);
    	SameTree t = new SameTree();
    	System.out.print(t.isSameTree(tree1, tree2));
    }
}
