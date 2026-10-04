package Arrayproblems;

import java.util.Scanner;

public class Example1SumAndAvg {

    public static void calculate(int[]arr){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        System.out.println("sum is "+sum);
        System.out.println("Avg is "+(float)sum/arr.length);
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter no");
            arr[i] = sc.nextInt();
        }
        calculate(arr);
    }
}
