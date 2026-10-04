package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static void main(String[] args){
        List<String> actors=new ArrayList<>();
        actors.add("Amitab");
        actors.add("Manoj");
        actors.add("Irfan");
        actors.add("Hritik");
       for(int i=0;i<actors.size();i++){
           String actor=actors.get(i);
           System.out.println(actor);
       }
        System.out.println("Reversing...");
       for(int i=actors.size()-1;i>=0;i--){
           String actor=actors.get(i);
           System.out.println(actor);
       }
    }
}
