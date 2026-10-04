package Arrayproblems;

import java.util.Arrays;

public class Checkdup {
    public static boolean checkDuplicates(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }return false;
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15,2};
        System.out.println(checkDuplicates(arr));
    }
}
