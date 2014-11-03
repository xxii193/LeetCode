package com.programing;

public class reverseSentence {

	public StringBuilder reverse (String str) {
		String[] newStr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = newStr.length - 1; i >= 0; i--){
			sb.append(newStr[i]);
			if(i > 0){
				sb.append(" ");
			}
		}
		return sb;
	}
	
	
	public static void main(String[] args){
		reverseSentence t = new reverseSentence();
		System.out.print(t.reverse("I am Lucy"));
		
	}
}
