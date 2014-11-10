package com.test;

class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
     TreeLinkNode( int x) { val = x; }
 }

public class PopulatingNextRightPointer {
	 public void connect(TreeLinkNode root) {
         if (root == null)
        	 return;
        TreeLinkNode pre = root;
        TreeLinkNode currHead = root;
        root.next = null;
        while(currHead.left!= null ){
               currHead = pre. left;
                while(pre != null ){
                	
                     pre.left.next = pre.right;
                     if (pre.next == null)
                    	 pre.right.next = null;
                     else
                    	 pre.right.next = pre.next.left;
                     pre = pre.next;
                     
               }
               pre = currHead;
               
        }
        
      
}
	 public static void main(String[] args){
		 PopulatingNextRightPointer t = new PopulatingNextRightPointer();
		   
		   
		 TreeLinkNode head = new TreeLinkNode(1);
		 TreeLinkNode l = new TreeLinkNode(2);
		 TreeLinkNode r = new TreeLinkNode(3);
		 head.left = l;
		 head.right = r;
		 t.connect(head);
		   
		   
		   
		 System.out.println(head.left.next.val);

	   }
}
