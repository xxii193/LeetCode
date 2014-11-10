package com.test;

public class LinkedListCycle2 {
	
	    public ListNode detectCycle(ListNode head) {
	    	if (head == null)
	    		return null;
	        ListNode fast = head;
	        ListNode slow = head;
	        do{
	        	if (fast.next == null ||fast.next.next == null){
	        		return null;
	        	}
	    		fast = fast.next.next;
	    		slow = slow.next;
	    		
	    	}while(fast != slow);
	        
	        slow = head;
	        while(slow != fast){
	        	
		        	slow = slow.next;
		        	fast = fast.next;
		        
	        }
	        
	        return fast;
	    }
}
