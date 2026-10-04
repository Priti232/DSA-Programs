package stringexamples;
public class Example21 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("RAHUL");

        System.out.println("sb is "+sb);//RAHUL
        System.out.println("Capacity:"+sb.capacity());//21
        System.out.println("Length:"+sb.length());//5

        sb.reverse();
        System.out.println();
        System.out.println("sb is "+sb);//LUHAR
        System.out.println("Capacity:"+sb.capacity());//21
        System.out.println("Length:"+sb.length());//5




    }
}
