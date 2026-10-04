package stringproblems;

//TC:O(n)
//SC: O(1)
public class Example1CountVowels {
    public static int countVowel(String str){
        str=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            switch(ch){
                case 'a','e','i','o','u'-> count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowel("Bhopal"));
    }
}

