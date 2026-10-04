package collectiondemo;


import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args){
        List<Integer> numList=new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(1,30);
        numList.add(2,40);
        numList.add(4,50);
        numList.add(5,60);
        numList.add(70);
        System.out.println(numList);
        


    }
}
