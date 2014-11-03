package com.programing;
import java.util.*;

	
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 
public class LevelOrder {
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if (root == null){
	            return result;
	        }
	        queue.offer(root);
	        int currLength = 1;
	        int nextLength ;
	        while(currLength != 0){
	        	nextLength = 0;
	            List<Integer> level = new ArrayList<Integer>();
	            
	           
	           while(currLength != 0){
	                TreeNode node = queue.poll();
	                currLength --;
	                level.add(node.val);
	                if (node.left != null){
	                    queue.offer(node.left);
	                    nextLength ++;
	                }
	                if (node.right != null){
	                    queue.offer(node.right);
	                    nextLength ++;
	                }
	               
	            }
	            result.add(level);
	            currLength = nextLength;
	        }
	        List<List<Integer>> result2 = new ArrayList<List<Integer>>();
	        System.out.print(result.size());
	        for (int i = 0 ;i < result.size(); i++){
	        	result2.add(result.get(result.size()-i-1));
	        }
	        return result2;
	    }
	    
	    public static void main(String[] args){
	    	LevelOrder t = new LevelOrder();
	    	TreeNode root = new TreeNode(4);
	    	TreeNode left = new TreeNode(3);
	    	root.left = left;
	    	System.out.println(t.levelOrder(root));
	    }
	}

