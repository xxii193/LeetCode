package com.test;
import java.util.*;

public class BinaryTreeInOrderTraversal {
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
  
      
        while (!stack.empty() || node != null){
	        if(node !=null){
	        	stack.push(node);
	        	node = node.left;
	        }
	        else{
	        	
		        node = stack.peek();
		        result.add(stack.pop().val);
			    node = node.right;
		        
	        }
	        
	        
        }
        return result;
        
        
    }
public static void main(String[] args){
	TreeNode root = new TreeNode(3);
	TreeNode l = new TreeNode(4);
	root.left = l;
	BinaryTreeInOrderTraversal t = new BinaryTreeInOrderTraversal();
	System.out.println(t.inorderTraversal(root).size());
	
}
}
