package com.test;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null){
        	return false;
        }
    	
    	ListNode fast = head;
    	ListNode slow = head;
    	do{
    		if (fast.next == null || fast.next.next ==null)
    			return false;
    		fast = fast.next.next;
    		slow = slow.next;
    		
    	}while(fast != slow);
    	return true;
    		
    }
    
    public static void main (String[] args){
    	LinkedListCycle t = new LinkedListCycle();
    	ListNode head = new ListNode(1);
    	ListNode head2 = new ListNode(2);
    	ListNode head3 = new ListNode(3);
    	ListNode head4 = new ListNode(4);
    	
    	head.next = head2;
    	head2.next = head3;
    	head3.next = head4;
    	head4.next = head;
    	System.out.print(t.hasCycle(head));
    }
}
