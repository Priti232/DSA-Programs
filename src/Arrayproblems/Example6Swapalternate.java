package Arrayproblems;

import java.util.Arrays;

public class Example6Swapalternate {
    public static void swapAlternate(int[]arr){
        int temp;
        for(int i=0;i<arr.length-1;i+=2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

    public static void main(String[]args) {
        int []arr={10,20,30,40,50,60};
        System.out.println("Before swap:"+ Arrays.toString(arr));
        swapAlternate(arr);
        System.out.println("Before swap:"+ Arrays.toString(arr));

    }
}
