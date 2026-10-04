package stringproblems;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//TC:O(n)
//SC: O(n)
public class Example4FreqCount {
    public static void freqCount(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+"-->"+e.getValue());
        }
    }

    public static void main(String[] args) {
        freqCount("apple");

    }
}
