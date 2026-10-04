package stringexamples;

public class Example20 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("SOFTWARE");

        System.out.println("sb is "+sb);//SOFTWARE
        System.out.println("Capacity:"+sb.capacity());//24
        System.out.println("Length:"+sb.length());//8

        sb.delete(1,4);
        System.out.println();
        System.out.println("sb is "+sb);//SWARE
        System.out.println("Capacity:"+sb.capacity());//24
        System.out.println("Length:"+sb.length());//5




    }
}
