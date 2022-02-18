package com.ak;

import java.util.Scanner;

//class FcfsSchdeulinAlgorithm {
//    public static void main(String[] args)  {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter No. Of Processes:");
//        int n = input.nextInt();
//
//        int[] processes = new int[n];
//        for (int i = 0; i < n; i++) {
//            processes[i] = i + 1;
//        }
//        System.out.print("Enter the Burst Time of the processes-> ");
//        int[] burstTime =new int[n];
//        for (int i = 0; i <n; i++) {
//            burstTime[i]=input.nextInt();
//        }
//        int[] arrTime=new int[n];
//        System.out.println();
//        System.out.print("Enter the arrival time of each process-> ");
//        for (int i = 0; i < n; i++) {
//            arrTime[i]=input.nextInt();
//        }
//
//        findavgTime(processes, n, burstTime);
//
//    }
//
//
//    static void findWaitingTime(int processes[], int n,
//                                int bt[], int wt[]) {
//
//        wt[0] = 0;
//
//
//        for (int i = 1; i < n; i++) {
//            wt[i] = bt[i - 1] + wt[i - 1];
//        }
//    }
//
//
//    static void findTurnAroundTime(int processes[], int n,
//                                   int bt[], int wt[], int tat[]) {
//
//        for (int i = 0; i < n; i++) {
//            tat[i] = bt[i] + wt[i];
//        }
//    }
//
//
//    static void findavgTime(int processes[], int n, int bt[]) {
//        int wt[] = new int[n], tat[] = new int[n];
//        int total_wt = 0, total_tat = 0;
//
//
//        findWaitingTime(processes, n, bt, wt);
//
//
//        findTurnAroundTime(processes, n, bt, wt, tat);
//
//
//        System.out.printf("Processes Burst time Waiting"
//                +" time Turn around time\n");
//
//
//        for (int i = 0; i < n; i++) {
//            total_wt = total_wt + wt[i];
//            total_tat = total_tat + tat[i];
//            System.out.printf(" %d ", (i + 1));
//            System.out.printf("	 %d ", bt[i]);
//            System.out.printf("	 %d", wt[i]);
//            System.out.printf("	 %d\n", tat[i]);
//        }
//        float s = (float)total_wt /(float) n;
//        int t = total_tat / n;
//        System.out.printf("Average waiting time = %f", s);
//        System.out.printf("\n");
//        System.out.printf("Average turn around time = %d ", t);
//    }
//
//}



 class FCFS {
    public static void main(String[] args) {

        System.out.println("Enter the number of process: ");
        Scanner in = new Scanner(System.in);
        int numberOfProcesses = in.nextInt();

        int[] pid = new int[numberOfProcesses];
        int[] bt = new int[numberOfProcesses];
        int[] ar = new int[numberOfProcesses];
        int[] ct = new int[numberOfProcesses];
        int[] ta = new int[numberOfProcesses];
        int[] wt = new int[numberOfProcesses];

        InputParameters(in, numberOfProcesses, pid, bt, ar);

        arrivalTimeScheduler(numberOfProcesses, pid, bt, ar);

        ct[0] = bt[0] + ar[0];
        for(int i = 1; i < numberOfProcesses; i++) {
            ct[i] = ct[i - 1] + bt[i];
        }
        for(int i = 0; i < numberOfProcesses; i++){
            ta[i] = ct[i] - ar[i];
            wt[i] = ta[i] - bt[i];
        }
        System.out.println("Process\t\tAT\t\tBT\t\tCT\t\tTAT\t\tWT");
        for(int i = 0; i < numberOfProcesses; i++) {
            System.out.println(pid[i]+"\t\t\t" + ar[i] + "\t\t" + bt[i]+ "\t\t" + ct[i]+ "\t\t" + ta[i]+ "\t\t" + wt[i]);
        }

        System.out.println("gantt chart: ");
        for(int i = 0; i < numberOfProcesses; i++) {
            System.out.print("P" + pid[i] +" ");
        }
    }

     static void arrivalTimeScheduler(int numberOfProcesses, int[] pid, int[] bt, int[] ar) {
         int temp;
         for (int i = 0; i < numberOfProcesses; i++) {
             for (int j = i+1; j < numberOfProcesses; j++) {

                 if(ar[i] > ar[j]) {
                     temp = ar[i];
                     ar[i] = ar[j];
                     ar[j] = temp;

                     temp = pid[i];
                     pid[i] = pid[j];
                     pid[j] = temp;
                     temp = bt[i];
                     bt[i] = bt[j];
                     bt[j] = temp;
                 }
             }
         }
     }

      static void InputParameters(Scanner in, int numberOfProcesses, int[] pid, int[] bt, int[] ar) {
         for(int i = 0; i < numberOfProcesses; i++) {
             System.out.println("Enter process " + (i+1) + " arrival time: ");
             ar[i] = in.nextInt();
             System.out.println("Enter process " + (i+1) + " brust time: ");
             bt[i] = in.nextInt();
             pid[i] = i+1;
         }
     }

 }


