package stringproblems;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//TC:O(n)
//SC: O(n)
public class Example6UniqueCharCount {
    public static int uniqueCharCount(String str){
        Set<Character>set=new HashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueCharCount("bhopal"));

    }
}
