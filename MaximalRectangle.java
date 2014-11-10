package com.test;

import java.util.Arrays;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
    	if (matrix == null || matrix.length == 0)
    		return 0;
        LargestRectangleFromHistogram t = new LargestRectangleFromHistogram();
        int max = 0;
    	int row = matrix.length;
        int col = matrix[0].length;
        int[][] height  = new int[row][col];
        for(int i = 0; i < row; i++){
        	for(int j = 0; j < col; j++){
        		if(matrix[i][j] == '1'){
        			height[i][j] = (i == 0? 1: (height[i - 1][j] + 1));
        		}else{
        			height[i][j] = 0;
        		}
        	}
        int[] rowRectangle = new int[col];
        rowRectangle = Arrays.copyOf(height[i], col);
        max = Math.max(t.largestRectangleArea(rowRectangle), max);
        }
    	return max;
        
    }
    public static void main(String[] args){
    	MaximalRectangle t = new MaximalRectangle();
        //char[][] matrix = {{'0','1','1'},{'0','1','1'},{'0','1','1'}};
        char[][] matrix = { {'1','1','1','1','0','0'},
        					{'1','1','1','0','1','1'},
        					{'1','0','1','0','1','1'},
        					{'0','1','1','1','1','1'},
        					{'1','1','1','1','1','1'}};
    	//char[][] matrix = {{'0','1'}};
        //char[][] matrix = {{'0','1'},{'1','0'}};
    	//int[] matrix={0};
    	System.out.println(t.maximalRectangle(matrix));
    }
    
}
