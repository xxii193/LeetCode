package com.test;

public class RemoveDuplicatesfromArray {
	public int removeDuplicates(int[] A) {
        if (A==null || A.length == 0){
        	return 0;
        }
        
		int j = 0;
		for(int i = 0; i<= A.length-1;i ++){
        	if (A[i] != A[j]){
        		A[++j] = A[i];
        	}
        }
		return j+1;
    }
	public static void main(String[] args){
		RemoveDuplicatesfromArray t = new RemoveDuplicatesfromArray();
		int[] A = {1,1,1,1};
		System.out.print(t.removeDuplicates(A));
	}
}
