package com.test;

public class RemoveElement {
	   public int removeElement(int[] A, int elem){
		   int index = 0;
		   for (int num : A){
			   if(num != elem){
				   A[index] = num;
				   ++index;
			   }
		   }
		   return index;
	   }
	   
}
