package stringproblems;

//TC:O(n)
//SC: O(1)
public class Example2CountVowelsCons {
    public static void countVowelCnsonant(String str){
        int countVowel=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            switch(ch){
                case 'a','e','i','o','u'->countVowel++;
            }
        }
        int countCons=str.length()-countVowel;
        String msg;
        msg=countVowel>countCons?"YES":countVowel<countCons?"NO":"SAME";
        System.out.println(msg);
    }

    public static void main(String[] args) {
        countVowelCnsonant("aim");

    }
}
