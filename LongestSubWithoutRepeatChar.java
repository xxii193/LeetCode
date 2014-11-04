package com.programing;


public class LongestSubWithoutRepeatChar {
    public int lengthOfLongestSubstring(String s) {
    	int start = 0;
    	int max = 0;
    	int result = 0;
    	int j = 0;
    	for (int i = 0; i < s.length(); i++) {
    		for (j = start; j < i; j++) {
    			if (s.charAt(i) == s.charAt(j)) {
    			  
    				start = j + 1;
    				result = i - j;
    				break;
    			}
    		}
    		if (j == i) {
    		   result++;
   			   max = Math.max(max, result);
    		}
    		 
    	}
    	
    	return max;
    	
    }
    public static void main(String[] args){
    	LongestSubWithoutRepeatChar t = new LongestSubWithoutRepeatChar();
    	System.out.println(t.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
    	//System.out.println(t.lengthOfLongestSubstring("abbbac"));
    	
    }
}
