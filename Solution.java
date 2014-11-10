package com.test;

public class Solution {
	class Point {
		public int x;
		public int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	class Rectangle {
		public Point leftBottom;
		public Point rightTop;
		
		public Rectangle(Point lb, Point rt) {
			leftBottom = lb;
			rightTop = rt;
		}

		public int getArea() {
			return (rightTop.x - leftBottom.x)*(rightTop.y-leftBottom.y);
		}

		
	}
    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
         Point leftBottom = new Point(K,L);
         Point rightTop = new Point(M,N);
    	 Rectangle rec1 = new Rectangle(leftBottom,rightTop);
    	
    	 leftBottom = new Point(P,Q);
    	 rightTop = new Point(R,S);
    	 Rectangle rec2 = new Rectangle(leftBottom, rightTop);
    	
    	
		 int left = Math.max(rec1.leftBottom.x, rec2.leftBottom.x);
		 int right = Math.min(rec1.rightTop.x,rec2.rightTop.x);
		 int bottom = Math.max(rec1.leftBottom.y, rec2.leftBottom.y);
		 int top = Math.min(rec1.rightTop.y,rec2.rightTop.y);
		 
		 boolean intersect;
		 
		 if (left < right && bottom < top) {
			 intersect = true;
		 } else {
			 intersect = false;
		 }
		 
    	 long area = 0;
    	 if (intersect) {
    		 return rec1.getArea() + rec2.getArea() - (right - left)*(top - bottom);
    	 }else {
    			 area = rec1.getArea() + rec2.getArea();
    	 }
		 
		 if (area > Integer.MAX_VALUE) {
			 return -1;
		 }
		return (int)area;
    }


	
	public static void main(String[] args) {
		Solution s = new Solution();
		//int result = s.solution(-4, 1, 2, 6, 0, -1, 4, 3);
		//int result = s.solution(0, -1, 4, 3,-4, 1, 2, 6);
		//int result = s.solution(0,0,1,1,3,3,4,4);
		//int result = s.solution(0,0,1,1,1,-1,2,0);
		int result = s.solution(0,0,Integer.MAX_VALUE,Integer.MAX_VALUE,1,-1,2,0);
		System.out.println(String.format("%d, %d",42,result));
	}
}
