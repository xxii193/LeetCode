package com.test;

public class ConstructTreeFromPreorderAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if (preorder.length == 0 || preorder == null)
    		return null;
    	TreeNode root = oneRecursive(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    	return root;
        
    }
    public TreeNode oneRecursive(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
    	if (inStart > inEnd)
    		return null;
    	TreeNode node = new TreeNode(preorder[preStart]);
    	int index = findIndex(inorder, inStart, inEnd, preorder[preStart]);
    	node.left = oneRecursive(preorder, preStart + 1, preStart + index - inStart, inorder, inStart, index - 1);
    	node.right = oneRecursive(preorder, preStart + index - inStart + 1, preEnd, inorder, index + 1, inEnd);
    	return node;
    	
    }
    public int findIndex(int[] A, int start, int end, int val){
    int i = start;
    for (i = start; i<= end; i++){
    	if (A[i] == val)
    		return i;
    }
    
    	return -1;
    }
    
    public static void main(String[] args){
    	int[] preorder = {1,2};
    	int[] inorder = {2,1};
    	ConstructTreeFromPreorderAndInorder t = new ConstructTreeFromPreorderAndInorder();
    	TreeNode node = t.buildTree(preorder, inorder);
    	System.out.println(node.left.val);
    }
    
}
