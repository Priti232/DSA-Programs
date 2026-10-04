package stringexamples;

public class Example5 {
    public static void main(String[] args) {
        String str1 = new String("BHOPAL");
        String str2 = new String("BHOPAL");
        String str3 = new String("bhopal");
        String str4 = new String("BhOPal");
        String str5 = new String("BHOJPAL");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str1.compareToIgnoreCase(str4));
        System.out.println(str1.compareToIgnoreCase(str5));


    }
}