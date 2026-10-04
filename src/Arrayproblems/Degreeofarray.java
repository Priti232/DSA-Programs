package Arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class Degreeofarray {
    public static int degree(int[]arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int maxkey=-1;
        int maxvalue=-1;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int value=entry.getValue();
            if(value>maxvalue){
                maxvalue=value;
                maxkey= entry.getKey();
            }
        }
        return maxkey;
    }

    public static void main(String args[]) {
        int arr[]={1,3,2,1,4,5,4,2,3,1,6,7};
        System.out.println(degree(arr));
    }
}
