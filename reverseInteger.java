package com.test;

public class reverseInteger {
	public int reverse(int i){
		int result = 0;
		while(i != 0){
			result = result * 10 + i % 10;
			i /= 10;
		}
		
		return result;
	}
	public static void main(String[] args){
		reverseInteger t = new reverseInteger();
	    System.out.print(t.reverse(-12040));
	    
	}
}
