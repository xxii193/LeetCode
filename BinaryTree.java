package com.test;

class BinaryTree {
	public int value;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	
	public BinaryTree(int val){
		this.value = val;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public BinaryTree(int val, BinaryTree left, BinaryTree right){
		this.value = val;
		this.leftChild = left;
		this.rightChild = right;
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BinaryTree getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTree leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTree getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTree rightChild) {
		this.rightChild = rightChild;
	}
	
	
}