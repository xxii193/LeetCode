package com.programing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval{
    int start;
    int end;
    Interval(){start = 0; end = 0;}
    Interval(int st, int en){start = st; end = en;}
}
class IntervalComparator implements Comparator<Interval>{
	public int compare(Interval i1, Interval i2){
		return i1.start - i2.start;
		
	}
}
public class MergeInterval {
	public ArrayList<Interval> Solution(ArrayList<Interval> intervals){
		Collections.sort(intervals, new IntervalComparator());
		ArrayList<Interval> result = new ArrayList<Interval>();
		for (int i = 0; i < intervals.size() - 1; i++){
			if (intervals.get(i).end < intervals.get(i+1).start){
				result.add(intervals.get(i));
					
			}else{
				intervals.set(i+1, new Interval(intervals.get(i).start, Math.max(intervals.get(i).end,intervals.get(i+1).end)));
			}
		}
		result.add(intervals.get(intervals.size()-1));
		return result;
	}

	
	public static void main(String[] args){
		ArrayList<Interval> in = new ArrayList<Interval>();
		Interval i1 = new Interval(9,18);
		Interval i2 = new Interval(1, 10);
		in.add(i1);
		in.add(i2);
		
		MergeInterval mi = new MergeInterval();
		ArrayList<Interval> in2 = mi.Solution(in);
				for (Interval i : in2){
					System.out.println("start: " + i.start + " end : " + i.end );
				}
		
	}
}
