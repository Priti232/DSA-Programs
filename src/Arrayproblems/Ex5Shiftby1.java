package Arrayproblems;

import java.util.Arrays;

public class Ex5Shiftby1 {

    public static void shiftBy1(int []arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;



    }

    public static void main(String args[]) {
        int[]arr={10,20,30,40,50};

        System.out.println("Before shifting:"+ Arrays.toString(arr));
        shiftBy1(arr);
        System.out.println("After shifting:"+Arrays.toString(arr));
    }

}
