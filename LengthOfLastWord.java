package com.programing;

public class LengthOfLastWord {
	public int wordLength(String s){
		
		if (s.equals(" ") || s == null){
			return 0;
		}else{
		String newStr = s.trim();
		System.out.println(newStr.length());
		if (newStr.equals(""))
			return 0;

		String[] strArray = newStr.split(" ");
		int len = strArray[strArray.length-1].length();
	    return len;
		}
	}
	public static void main(String[] args){
		LengthOfLastWord t = new LengthOfLastWord();
		System.out.print(t.wordLength("a"));
		
	}

}
