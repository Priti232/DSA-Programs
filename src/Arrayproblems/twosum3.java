package Arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum3 {
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map=new HashMap<>();
            int []arr=new int[2];
            for(int i=0;i<nums.length;i++){
                int diff=target-nums[i];
                if(map.containsKey(diff)){
                    arr[0]=map.get(diff);
                    arr[1]=i;;
                    return arr;
                }
                map.put(nums[i],i);
            }
            return arr;
        }

        public static void main(String[] args) {
            int []arr={2,7,11,15};
            System.out.println(Arrays.toString(twoSum(arr,9)));



        }
    }

