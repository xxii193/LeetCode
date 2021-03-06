package com.test;
import java.util.*;


  

public class BinaryTreePreOrderTrversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null){
        	return result;
        }
        stack.push(root);
        while(!stack.empty()){
        	TreeNode node = stack.pop();
        	result.add(node.val);
        	if (node.right != null){
        		stack.push(node.right);
        	}
        	if (node.left != null){
        		stack.push(node.left);
        	}
        	
        }
        return result;
    }
    
   
}