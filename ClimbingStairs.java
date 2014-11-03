package com.programing;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int sn = 0;
        if (n <= 2){
        	return n;
        }
        int sn2 = 1;
        int sn1 = 2;
        for(int i = 3; i <= n; i++){
        	sn = sn1 + sn2;
        	sn2 = sn1;
        	sn1 = sn;
        
        }
        return sn;
    }
    public static void main(String[] args){
    	int n = 4;
    	ClimbingStairs t = new ClimbingStairs();
    	System.out.println(t.climbStairs(n));
    }
}
