package Arrayproblems;

import java.util.Arrays;

public class Reversearray {
        public static void reverse(int [] arr){

            int left=0,right=arr.length-1;
            int temp;
            while(left<right){
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }

        public static void main(String[] args) {
            int [] arr={10,80,30,40,50};
            System.out.println("Before reversing:"+ Arrays.toString(arr));
            reverse(arr);
            System.out.println("After reversing:"+ Arrays.toString(arr));
        }
    }

