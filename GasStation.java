package com.programing;

public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost){
        int sum = 0;
        int start = 0;
        if(gas.length == 0 || gas == null || cost ==null || gas.length != cost.length ){
            return -1;
        }
        for(int i = 0; i < gas.length; i++){
        	sum += (gas[i] - cost[i]);
        	if(sum < 0){
        		start = i + 1;
        		sum = 0;
        	}
        }
        
        for(int j = 0; j < start; j++){
        	sum += (gas[j] - cost[j]);
        	if(sum < 0){
        		return -1;
        	}
        }
    	return start;
    }
	
	public static void main(String[] agrs){
		GasStation t = new GasStation();
		int[] gas = {1,2,3};
		int[] cost = {1,2,3};
		System.out.println(t.canCompleteCircuit(gas, cost));
	}
}
