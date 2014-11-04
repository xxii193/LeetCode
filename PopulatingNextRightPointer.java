package com.programing;


class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
     TreeLinkNode(int x) { val = x; }
 }
public class PopulatingNextRightPointer {
	public void connect(TreeLinkNode root) {
		if (root == null)
	      	return;
	    if (root.right == null && root.left == null)
	      	root.next = null;
		TreeLinkNode node = root;
		TreeLinkNode curr = root;
		TreeLinkNode next = root;
		while(next != null){
			next = node.left;
			while(node != null){
				curr = node.left;
				curr.next = node.right;
				curr.next.next = node.next.left;
				node = node.next;
				
			}
			
		}
		
		
	      
    }
	  
    
}
