package com.test;
import java.util.*;
public class SubSet {
	
	
    public List<List<Integer>> subsets(int[] S) {
    	if (S == null || S.length == 0){
    		return null;
    	}
    	Arrays.sort(S);
    	ArrayList<Integer> path = new ArrayList<Integer>();
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
        solution(S, 0, path,list);
        return list;
       
    }
    public void solution(int[] S, int level, ArrayList<Integer> tempList, List<List<Integer>>list){
        
    	if (level == S.length){
    		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
    		for (int i = 0; i< tempList.size(); i ++){
    			tempList2.add(tempList.get(i));
    		}
    		list.add(tempList2);
    		return;
    	}
    	tempList.add(S[level]);
    	solution(S, level + 1, tempList,list);
    	tempList.remove(tempList.size() - 1);
    	solution(S, level + 1, tempList,list);
    	
    }
    
    public static void main(String[] args){
    	SubSet t = new SubSet();
    	int[] num = {0,1};
    	List<List<Integer>> list = t.subsets(num);
    	System.out.println(list.get(0));
    	
    }
}
