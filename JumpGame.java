package com.programing;

public class JumpGame {
    public boolean canJump(int[] A) {
    	if (A == null || A.length == 0)
    		return false;
        int max = A[0];
    	for (int i = 1; i < A.length; i++){
    		if(max <= 0)
    			return false;
    		max--;
    		max = Math.max(max, A[i]);
    		

    	}
    	return true;
    }
    public static void main(String[] args){
    	int[] num = {3,2,1,0,4};
    	JumpGame t = new JumpGame();
    	System.out.print(t.canJump(num));
    }
}
