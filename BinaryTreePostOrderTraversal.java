package com.test;
import java.util.*;

public class BinaryTreePostOrderTraversal {
	public List<Integer> solution(TreeNode root) {
		
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        
        while(!stack.isEmpty() || node != null){
        	if (node!= null){
             	stack.push(node);
             	node = node.left;
             }
        	else{
        		TreeNode tmp = stack.pop();
                result.add(tmp.val);
             	node = tmp.right;
             }
        	
        }
       return result;
        
        
    }
}
