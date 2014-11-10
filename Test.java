package com.test;
import java.util.*;

public class Test {
    
	public double findMedianSortedArrays(int[] A, int m, int B[], int n){
		int total = m+n;
		if( total%2 !=0){
			return find_kth(A,m,B,n,total/2+1);
		}
		else{
			return (find_kth(A,m,B,n,total/2)+find_kth(A,m,B,n,total/2+1))/2.0;
		}
	}
	double find_kth(int[] A, int m, int[] B, int n, int k){
		if(m > n){
			return find_kth(B, n, A, m, k);
		}
		if(m == 0){
			return B[k-1];
		}
		if(k == 1){
			return Math.min(A[0], B[0]);
		}
		
		int pa = Math.min(k/2, m);
		int pb = k -pa;
		if(A[pa-1] < B[pb-1]){
			return find_kth(Arrays.copyOfRange(A, pa, A.length), m-pa, B, n, k-pa);
		}else if(A[pa-1] > B[pb-1]){
			return find_kth(A,m,Arrays.copyOfRange(B, pb, B.length), n-pb, k-pb);
		}else{
			return A[pa-1];
		}
		
		
	}
	
	
	
	


   
   
   
   
   public static void main(String[] args){
	   Test t = new Test();
	   //int[] a = {1,2,5,4,5};
	   //System.out.println(t.removeElement(a, 5));
	   /*
	   ListNode ll1 = new ListNode(1);
	   ListNode ll2 = new ListNode(2);
	   ListNode ll3 = new ListNode(3);
	   ListNode ll4 = new ListNode(9);
	   ListNode ll5 = new ListNode(10);
	   ListNode ll6 = new ListNode(6);
	   ll1.next = ll2;
	   ll2.next = ll3;
	   ll4.next = ll5;
	   ll5.next = ll6;
	   System.out.print(t.addTwoNumbers(ll1, ll4).val);
	   System.out.print(t.addTwoNumbers(ll1, ll4).next.val);
	   System.out.print(t.addTwoNumbers(ll1, ll4).next.next.val);
	   System.out.print(t.addTwoNumbers(ll1, ll4).next.next.next.val);
	   */
	   int[] A = {1,3};
	   int[] B = {3};
	   double result = t.findMedianSortedArrays(A, 2, B, 1);
	   System.out.println(result);

   }
   
}
