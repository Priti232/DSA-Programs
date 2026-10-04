package Arrayproblems;

public class removedup2 {
    public static int removeDuplicates(int[]nums){
        int w=0;
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[w]){
                ++w;
                nums[w]=nums[r];
            }
        }
        return w+1;
    }
    public static void main(String []args ){
            int[]arr={2,7,7,11,12,14,14,16};
            System.out.println(removeDuplicates(arr));}
}
