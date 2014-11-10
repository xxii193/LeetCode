package com.test;


public class RemoveDuplicatefromSorted {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null){
			return null;
		}
		
		ListNode node = head;
        while (node != null &&node.next!= null){
        	if (node.val == node.next.val){
        		
        			node.next = node.next.next;
        		
        	}else{
        		node = node.next;
        	}
        		
        }
        return head;
    }
	
	   public static void main(String[] args){
		   RemoveDuplicatefromSorted t = new RemoveDuplicatefromSorted();
		   
		   //int[] a = {1,2,5,4,5};
		   //System.out.println(t.removeElement(a, 5));
		   
		   ListNode head = new ListNode(1);
		   ListNode ll2 = new ListNode(1);
		   ListNode ll3 = new ListNode(2);
		   head.next = ll2;
		   ll2.next = ll3;
		   
		   
		   
		   
		   System.out.println(t.deleteDuplicates(head).next.val);

	   }
}
