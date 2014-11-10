package com.test;

public class PlusOne {
public int[] plusOne(int[] digits) {
	    int carries = 1;
        for(int i = digits.length -1 ; i >= 0 && carries == 1; i --){
        	digits[i] += carries;
        	carries = digits[i] / 10;
        	digits[i] = digits[i] % 10;
        }
        if (carries == 0)
        	return digits;
        else{
        	int[] newDigits = new int[digits.length + 1];
        	newDigits[0] = 1;
        	for ( int j = digits.length; j >= 1; j --){
        		newDigits[j] = digits[j-1];
        	}
        	return newDigits;
        }
       
    }

public static void main(String[] args){
	PlusOne t = new PlusOne();
	int[] num = {1,0,8,9,9,9};
	 t.plusOne(num);
	 for(int one: num){
		 System.out.println(one);
	 }
}
}
