package com.test;


public class MultipleString {
    public String multiply(String num1, String num2) {
    	StringBuilder str = new StringBuilder();
    	if(num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0){
    		
    		return null;
    	}
    	int length1 = num1.length();
    	int length2 = num2.length();
    	
    	int[] result = new int[length1 + length2];
        for (int i = length1 - 1; i >= 0; i--){
        	
        	for (int j = length2 - 1; j >= 0; j--){
        		//result[i + j + 1] += (num2.charAt(j) - '0')* (num1.charAt(i) - '0');
        		result[i + j + 1] += (int)(num2.charAt(j))* (int)(num1.charAt(i));
        	}
        }
        int carries = 0;
        for(int i = result.length - 1; i >= 0; i--){
        	result[i] += carries;
        	carries = result[i] / 10;
            result[i] = result[i] % 10;
            
        }
        int j = 0;
        while(j < result.length - 1 && result [j] == 0){
        	j ++;
        }
        while( j <= result.length - 1){
        	str.append(result[j]);
        	j ++;
        }
        return str.toString();
    }
    
    public static void main(String[] args){
    	MultipleString t = new MultipleString();
    	int a = (int)'2';
    	System.out.println(a);
    	System.out.println("" + t.multiply("9", "9"));
    }
}
