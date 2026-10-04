package Arrayproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Checkdup2 {
    public static boolean checkDuplicates(int arr[]){
        Set<Integer> set =new HashSet<>();
        for(int x:arr) {
            boolean res = set.add(x);
            if (res == false) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15,2};
        System.out.println(checkDuplicates(arr));
    }

}
