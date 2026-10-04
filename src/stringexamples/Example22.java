package stringexamples;

public class Example22 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("HELLO WORLD!");

        System.out.println("sb is "+sb);//HELLO WORLD!
        System.out.println("Capacity:"+sb.capacity());//28
        System.out.println("Length:"+sb.length());//12

        sb.replace(6,11,"HINDUSTANIO");
        System.out.println();
        System.out.println("sb is "+sb);//HELLO INDIA!
        System.out.println("Capacity:"+sb.capacity());//28
        System.out.println("Length:"+sb.length());//18




    }
}
