package com.test;

import java.util.Arrays;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0)
        	return 0;
        
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        int[][] status = new int[m+1][n+1];
        for(int[] row:status){
        	Arrays.fill(row, Integer.MIN_VALUE);
        }
        
        return Recursive(grid, status, m, n);
        		
    }
	
	public int Recursive(int[][] A, int[][] status, int i , int j){
		if (i == 0 && j == 0){
			if (status[0][0] == Integer.MIN_VALUE){
				status[0][0] = A[0][0];
			}
			return status[0][0];
		}
		
		if (i == 0){
			if (status[i][j] == Integer.MIN_VALUE){
				status[i][j - 1] = Recursive(A, status, i , j - 1);
				status[i][j] = status[i][j - 1] + A[i][j];
        	}
			return status[i][j];
		}
		if (j == 0){
			if (status[i][j] == Integer.MIN_VALUE){
				status[i - 1][j] = Recursive(A, status, i - 1, j);
				status[i][j] = status[i - 1][j] + A[i][j];
        	}
			return status[i][j];
		}
		if (status[i][j - 1] == Integer.MIN_VALUE){
			status[i][j - 1] = Recursive(A, status, i, j - 1);
		}
		if (status[i - 1][j] == Integer.MIN_VALUE){
			status[i - 1][j] = Recursive(A, status, i - 1, j);
		}
		status[i][j] = Math.min(status[i - 1][j], status[i][j - 1]) + A[i][j];
		return status[i][j];
	}
	
	public static void main(String[] args){
		int[][] sum = new int[1][1];
	
		sum[0][0] = 0;
		/*sum[0][1] = 2;
		sum[0][2] = 3;
		sum[1][0] = 4;
		sum[1][1] = 0;
		sum[1][2] = 9;*/

		MinimumPathSum t = new MinimumPathSum();
		
		System.out.println(t.minPathSum(sum));
	}
}
