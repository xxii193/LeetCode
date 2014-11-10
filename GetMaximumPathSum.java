package com.test;

public class GetMaximumPathSum {
	public int getMaximumPathSum(BinaryTree root){
		if(root == null){
			return 0;
		}
		return Math.max(getMaximumPathSum(root.getLeftChild()), getMaximumPathSum(root.getRightChild())) + root.getValue();
		  //return Math.max(Math.max(getMaximumPathSum(root.getLeftChild()), getMaximumPathSum(root.getRightChild())), getMaximumPathSum(root.getLeftChild())+getMaximumPathSum(root.getRightChild())) + root.getValue();
	}
	
	public static void main(String[] args){
		BinaryTree bTree = new BinaryTree(7);
		BinaryTree bLeft = new BinaryTree(6);
		BinaryTree bRight = new BinaryTree(9);
		bTree.setLeftChild(bLeft);
		bTree.setRightChild(bRight);
		
		GetMaximumPathSum sum = new GetMaximumPathSum();
		System.out.println(sum.getMaximumPathSum(bTree));
		
	}
}
