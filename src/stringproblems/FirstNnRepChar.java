package stringproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//TC:O(n)
//SC: O(n)
public class FirstNnRepChar {
    public static int firstNonRepeatingChar(String str) {
        Map<Character,Integer> map=new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(map.get(ch)==1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("india"));

    }
}
