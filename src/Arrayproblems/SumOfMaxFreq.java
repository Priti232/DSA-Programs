package Arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class SumOfMaxFreq {
    public static int sumOfMaxFreq(int [] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int maxFreqValue=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=maxFreqValue){
                maxFreqValue=entry.getValue();
            }
        }
        int sum=0;
        for(int x : map.values()){
            if(x == maxFreqValue){
                sum += x;
            }
        }
        return sum;
    }

    static void main() {
        int [] arr={1,2,3,4,5};
        System.out.println(sumOfMaxFreq(arr));
    }
}
