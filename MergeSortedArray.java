package com.programing;

public class MergeSortedArray {
	public void Solution(int[] A, int m, int[] B, int n){
		int index = m + n -1;
		m--;
		n--;
		while (m >= 0 && n >= 0){
			if (B[n] > A[m]){
				A[index] = B[n];
				n--;
				index --;
			}else{
				A[index] = A[m];
				m --;
				index --;
			}
		}
		while ( n > 0){
			A[index] = B[n];
			index --;
			n --;
		}
	}

}
