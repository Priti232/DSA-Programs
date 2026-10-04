package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Amitab");
        actors.add("Manoj");
        actors.add("Irfan");
        actors.add("Hritik");

        for(String str:actors){
            System.out.println(str);
        }
    }
}
