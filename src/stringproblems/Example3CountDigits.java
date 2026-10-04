package stringproblems;

//TC:O(n)
//SC: O(1)
public class Example3CountDigits {
    public static int countDigits(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)){
                ++count;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits("02468abcd123"));

    }
}
