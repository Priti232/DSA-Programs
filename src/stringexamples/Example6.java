package stringexamples;

public class Example6 {
    public static void main(String[]args){
        String str1=new String("APPLE");
        String str2=new String("appl");
        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
