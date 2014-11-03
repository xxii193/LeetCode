package com.programing;

public class Solution {
    class Point {
          public int x ;
          public int y ;
         
          public Point(int x , int y) {
                 this.x = x ;
                 this.y = y ;
         }
   }
    class Rectangle {
          public Point leftBottom ;
          public Point rightTop ;
         
          public Rectangle(Point lb , Point rt ) {
                 leftBottom = lb ;
                 rightTop = rt;
         }

          public int getArea() {
                 return (rightTop .x - leftBottom.x )*(rightTop .y -leftBottom .y );
                
         }

          public boolean below(Rectangle rec2) {
                 return this .leftBottom .y < rec2 .leftBottom .y ;
         }
   }
public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
   Point leftBottom = new Point(K ,L );
   Point rightTop = new Point(M ,N );
   Rectangle rec1 = new Rectangle(leftBottom ,rightTop );
   
   leftBottom = new Point(P ,Q );
   rightTop = new Point( R, S);
   Rectangle rec2 = new Rectangle(leftBottom , rightTop );
   
   boolean intersect = isIntersected(rec1 ,rec2 );
   
   int area = -1;
    if (intersect ) {
          //int intersectedArea =  calIntersectedArea(rec1, rec2);
          //return rec1.getArea()+rec2.getArea()-intersectedArea;
          int left = Math.max (rec1 .leftBottom .x , rec2 .leftBottom .x );
          int right = Math.min( rec1. rightTop. x, rec2. rightTop. x);
          int bottom = Math.max (rec1 .leftBottom .y , rec2 .leftBottom .y );
          int top = Math.min (rec1 .rightTop .y ,rec2 .rightTop .y );
          int temp =  Math.abs((right - left )*(top - bottom ));
          System.out.println(String.format("%d,%d,%d,%d",left,right,bottom,top));
          return rec1.getArea()+rec2.getArea()-temp;
    } else {
                 area = rec1.getArea() + rec2.getArea();
    }
         
          final int MAXIMUM = 2147483647;
          if (area > MAXIMUM ) {
                 return -1;
          }
          return area ;
}

    private int calIntersectedArea(Rectangle rec1, Rectangle rec2) {
         Rectangle above, below;
          if (rec1 .below(rec2 )) {
                 above = rec2;
                 below = rec1;
          } else {
                 above = rec1;
                 below = rec2;
          }
         
          int width = (above .rightTop .x - below .leftBottom .x );
          int height = below .rightTop .y - above .leftBottom .y ;
         
          return width * height ;
   }

    private boolean isIntersected(Rectangle rec1, Rectangle rec2) {
          int left = Math.max (rec1 .leftBottom .x , rec2 .leftBottom .x );
          int right = Math.min( rec1. rightTop. x, rec2. rightTop. x);
         
          int bottom = Math.max (rec1 .leftBottom .y , rec2 .leftBottom .y );
          int top = Math.min (rec1 .rightTop .y ,rec2 .rightTop .y );
          if (left < right && bottom < top) {
                 return true ;
          } else {
                 return false ;
          }
   }
   
   
    public static void main(String[] args) {
         Solution s = new Solution();
          int result = s .solution(-4, 1, 2, 6, 0, -1, 4, 3);
         
         System. out.println(String.format( "%d, %d",42,result ));
   }
}
