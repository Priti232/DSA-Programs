package Arrayproblems;

import java.util.Scanner;

public class Ex3findindex {
    public static int findindex(int arr[],int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;

        }
    }
    return -1;
    }
        public static void main(String[]args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter array");
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target");
        int target= sc.nextInt();

        int index=findindex(arr,target);
        System.out.println("Index=" + index);
        }
    }

