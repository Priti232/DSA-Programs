package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args){
        List<String> actors=new ArrayList<>();
        actors.add("Amitab");
        actors.add("Manoj");
        actors.add("irfan");
        actors.add("Hritik");
        actors.add("sonam");
        System.out.println("First index:"+ actors.get(0));
        System.out.println("Last index:"+ actors.get(3));
        System.out.println("Last Index:"+ actors.get(4));
    }
}
