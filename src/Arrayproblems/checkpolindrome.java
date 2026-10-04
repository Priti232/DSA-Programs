package Arrayproblems;

public class checkpolindrome {
        public static boolean isPalindrome(String s1){
            String s2="";
            for(int i=s1.length()-1;i>=0;i--){
                s2+=s1.charAt(i);
            }
            if(s1.equals(s2)){
                return true;
            }
            return false;
        }
        public static boolean isPalindrome2(String s1){
            int left,right;
            for(left=0,right=s1.length()-1;left<right;left++,right--){
                if(s1.charAt(left)!=s1.charAt(right)){
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {

            String str="NITIN";
            System.out.println(isPalindrome(str));
            str="NAVIN";
            System.out.println(isPalindrome(str));


        }
    }


