package Arrayproblems;

public class Ex4FirstUnsorted {
    public static int firstUnsorted(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int []arr={10,20,30,15,40,50,60};
        System.out.println("First unsorted:"+firstUnsorted(arr));
    }
}
