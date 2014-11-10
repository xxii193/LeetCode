package com.test;

public class SearchInsertPosition {
	public int searchInsert(int[] A, int target) {
		int i = 0;
        for (; i < A.length; i++){
        	if (A[i] == target)
        		return i;
        	else if (A[i] > target)
        		return i;
        }
        return i;
    }

}
