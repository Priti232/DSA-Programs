package Arrayproblems;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class getsecondlargest {

    public static int  getsecondlargest(int[]arr){

        int max=-1;
        int secmax=-1;
        for(int x:arr){
            if(x>max){
                secmax=max;
                max=x;
            }else if(x>secmax && x!=max){
                secmax=x;
            }
        }
        return secmax;
    }

    public static void main(String args[]) {
        int[]arr={9,9,9,8};
        System.out.println(getsecondlargest(arr));

    }
}
