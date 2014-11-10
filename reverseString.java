package com.test;

public class reverseString {
    public String reverse(String s){
    	if (s == null || s.length() == 0)
    		return "";
    	StringBuilder newStr = new StringBuilder();
    	String[] strArray = s.split(" ");
    	for(int i = strArray.length - 1; i >= 0; i--){
    		if (!strArray[i].equals("")){
    			newStr.append(strArray[i]).append(" ");
    		}
    	}
    	
    	return newStr.length() == 0?"":newStr.substring(0, newStr.length() - 1);
    }
    
    public static void main(String[] args){
     reverseString t = new reverseString();
    
     System.out.print(t.reverse(""));
    }
}
