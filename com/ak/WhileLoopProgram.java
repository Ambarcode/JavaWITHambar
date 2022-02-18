package com.ak;

import java.util.Scanner;
/* NOTE: WE CAN CREATE OBJECTS OF SAME NAME OF SAME CLASS IN DIFFERENT SCOPES JUST LIKE VARIABLE*/

 class LoopProgram {
    public static void main(String[] args) {
        LoopProgram obj =new LoopProgram();
        //obj.usingWhileLoop();
         //obj.usingDoWhile();
         obj.usingBreakContinue();

    }

      void usingBreakContinue() {
          int n;
          Scanner sc = new Scanner(System.in);
          while (true) {
              System.out.println("Enter a number between 1 and 10-> ");
              n = sc.nextInt();

              if (n < 1 || n > 10) {
                  continue;
              }

              break;

          }
          System.out.println(n + " is a number between 1 and 10");
      }

     void usingWhileLoop() {
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        while (input<1 || input>10){
            System.out.println(input+" is not Between 1 And 10");
            input= sc.nextInt();
        }
        System.out.println(input+" is between 1 and 10");
    }

    void usingDoWhile() {
        Scanner input= new Scanner(System.in);
        int inp;
        do{
            System.out.println("Enter a Number between 1 and 10-->");
            inp=input.nextInt();

        }while(inp<1 || inp>10);
    }
}
