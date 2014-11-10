package com.test;

public class AddBinary {
    public String addBinary(String a, String b) {
    	if(a == null || b == null)
    		return null;
    	
    	if(a.length() > b.length()){
    		 String tmp = a;
    		 a = b;
    		 b = tmp;
    	}
        
        StringBuilder result = new StringBuilder();
        
        int carry = 0;
        int i = (a.length() == 0? -1: (a.length() - 1));
        int j = (b.length() == 0? -1: (b.length() - 1));
        while (i >= 0){
        	int tmp = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            carry = tmp / 2;
            tmp = tmp % 2;
            result.append(Integer.toString(tmp));
            i --;
            j --;
       
        }
        while (j >= 0){
        	int tmp = b.charAt(j) - '0' + carry;
            carry = tmp / 2;
            tmp = tmp % 2;
            result.append(Integer.toString(tmp));
            j--;
        }
        if (carry != 0){
        	result.append(Integer.toString(carry));
        }
        return result.toString();
    }
    
    public static void main(String[] args){
    	AddBinary t = new AddBinary();
    	System.out.print(t.addBinary("", ""));
    }
}
