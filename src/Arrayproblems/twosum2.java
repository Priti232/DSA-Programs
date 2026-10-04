package Arrayproblems;

import java.util.Arrays;

public class twosum2 {
        public static  int[] twoSum(int[] numbers, int target) {

            int[] ans = new int[2];
            int left=0;
            int right=numbers.length-1;
            while(left<right){
                int sum=numbers[left]+numbers[right];
                if(sum==target){
                    ans[0]=left+1;
                    ans[1]=right+1;
                    return ans;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            int []arr={2,7,11,15};
            System.out.println(Arrays.toString(twoSum(arr,9)));



        }
    }

