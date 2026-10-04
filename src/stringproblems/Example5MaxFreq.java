package stringproblems;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//TC:O(n)
//SC: O(n)
public class Example5MaxFreq {
    public static char maxFreq(String str){
        Map<Character,Integer> map=new TreeMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        char ch=' ';
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
                ch=entry.getKey();
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        System.out.println(maxFreq("testsample"));

    }
}
