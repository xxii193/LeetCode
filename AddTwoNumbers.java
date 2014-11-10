package com.test;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		if (l1 == null){
			return l2;
		}
		if (l2 == null){
			return l1;
		}
		int len1 = 0;
		int len2 = 0;
		
		ListNode head = l1;
		
		while (head != null){
			++len1;
			head = head.next;
		}
		
		head = l2;
		
		while (head != null){
			++len2;
			head = head.next;
		}
		
		ListNode longer = len1>=len2?l1:l2;
		ListNode shorter = len1<len2?l1:l2;
		
		ListNode result = null;
		ListNode sum = null;
		
		int val = 0;
		int carry = 0;
		
		while (shorter != null) {
			val = longer.val +shorter.val + carry;
			carry = val /10;
			val -= carry*10;
			
			if (sum == null){
				sum = new ListNode(val);
				result = sum;
			}else{
				sum.next = new ListNode(val);
				sum = sum.next;
			}
			longer = longer.next;
			shorter = shorter.next;
			
		}
		while (longer != null){
			val = longer.val +carry;
			carry = val/10;
			val -=carry*10;
			
			sum.next = new ListNode(val);
			sum = sum.next;
			longer = longer.next;
		}
		if (carry != 0){
			sum.next = new ListNode(carry);
		}
		return result;
	}
}
