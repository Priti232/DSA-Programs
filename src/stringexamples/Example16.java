package stringexamples;

public class Example16 {
    public static void main(String[] args) {
        String s="Sachin";
        System.out.println(s.startsWith("Sach"));//T
        System.out.println(s.startsWith("ach"));//F
        System.out.println(s.endsWith("in"));//T
        System.out.println(s.endsWith("hi"));//F

    }
}
