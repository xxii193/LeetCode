package com.programing;

public class ConvertSortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] num) {
		
        if (num == null || num.length == 0){
        	return null;
        }
        return solution(num,0,num.length -1);
		
    }
	
	public TreeNode solution(int[]A, int m, int n){
		TreeNode root;
		if (m > n){
			return null;
		}
		
		int middle = (m+n)/2 ;
		root = new TreeNode(A[middle]);
		root.left = solution(A,m,middle-1);
		root.right = solution(A,middle+1,n);
		return root;
		
		
		
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		ConvertSortedArrayToBST t = new ConvertSortedArrayToBST();
		System.out.print(t.sortedArrayToBST(a).left.left);
	}

}
