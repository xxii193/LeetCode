package com.test;

public class GetTreeDepth {
	
	public int getDepth(BinaryTree root){
		if( root == null)
			return 0;
		return Math.max(getDepth(root.getLeftChild()), getDepth(root.getRightChild())) + 1;
	}
	
	
	public static void main(String[] args){
		BinaryTree bTree = new BinaryTree(4);
		BinaryTree bLeft = new BinaryTree(6);
		BinaryTree bRight = new BinaryTree(9);
		bTree.setLeftChild(bLeft);
		bTree.setRightChild(bRight);
		
		GetTreeDepth depth = new GetTreeDepth();
		System.out.println(depth.getDepth(bTree));
	}	
	
}
