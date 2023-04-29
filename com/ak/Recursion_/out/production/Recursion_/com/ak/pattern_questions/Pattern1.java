package com.ak.pattern_questions;
class Pattern1 {
    public static void main(String[] args) {
        //simply using iteration
//        for(int i=1;i<=5;i++){
//            for(int j=0;j<5-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        //now with the help of recursion
         pattern1(4,0);
    }
    private static void pattern1(int r , int c){
         if(r==0) return;

         if(c<r){
             System.out.print("*");
             pattern1(r,c+1);
         } else {
             System.out.println();
             pattern1(r-1,0);
         }
    }
}

class Pattern2{
    public static void main(String[] args) {
        pattern2(4,0);
    }
    private static void pattern2(int r , int c){
        if(r==0) return;

        if(c<r){
            pattern2(r,c+1);
            System.out.print("*");
        } else {
            pattern2(r-1,0);
            System.out.println();
        }
    }

}
