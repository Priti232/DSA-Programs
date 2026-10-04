package Arrayproblems;

import java.util.Scanner;

public class EX2countevenodd {

    public static int[] countevenodd(int[] arr) {
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            while (num > 0) {
                int rem = num % 10;

                if (rem % 2 == 0) {
                    evencount++;
                } else {
                    oddcount++;
                }
                num = num / 10;
            }
        }
            int arrcount[]=new int[2];
            arrcount[0]=evencount;
            arrcount[1]=oddcount;

            return arrcount;
    }



    public static void main(String args[]) {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter no");
            arr[i] = sc.nextInt();
        }
        int result[] = countevenodd(arr);

        System.out.println("Even count=" + result[0]);
        System.out.println("odd count=" + result[1]);
    }
}
