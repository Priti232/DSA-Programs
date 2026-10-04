package stringproblems;


import java.util.HashSet;
import java.util.Set;

//TC:O(n^2)
//SC: O(1)
public class Example7FirstNnRepChar {
    public static int firstNonRepeatingChar(String str) {
        for(int i=0;i<str.length();i++) {
            int count=0;
            for(int j=0;j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    ++count;
                }
            }
            if(count==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("india"));

    }
}

