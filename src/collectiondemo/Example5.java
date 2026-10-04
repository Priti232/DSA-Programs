package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args){
        List<String> actors=new ArrayList<>();
        System.out.println("Total actors:" +actors.isEmpty());//True
        actors.add("Amitab");
        actors.add("Manoj");
        actors.add("Irfan");
        actors.add("Hritik");
        System.out.println("ArraysList empty?"+actors.isEmpty());//False
    }
}
