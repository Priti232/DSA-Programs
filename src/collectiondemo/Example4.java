package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args){
        List<String> actors=new ArrayList<>();
        System.out.println("Total actors:" +actors.size());//0
        actors.add("Amitab");
        actors.add("Manoj");
        actors.add("Irfan");
        actors.add("Hritik");
        System.out.println("total actors:"+actors.size());//4
    }
}
