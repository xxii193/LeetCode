package com.programing;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
    	if(numbers == null || numbers.length == 0 || numbers.length == 1){
    		return null;
    	}
    	int[] result = {-1,-1};
    	
        Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
       
        for(int j = 0;j < numbers.length; j++){
        	if(hashMap.containsKey(target - numbers[j])){

				result[1] = j + 1;
				result[0] = hashMap.get(target - numbers[j]) + 1;
				break;
        	}else{
        		hashMap.put(numbers[j], j);
        	}
        }

        return result;
    }
    
    public static void main(String[] args){
    	TwoSum t = new TwoSum();
    	int[] numbers = {3,2,4};
    	int target = 6;
    	System.out.println(t.twoSum(numbers, target)[0]);
    }
}
