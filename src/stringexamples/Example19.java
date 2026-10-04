package stringexamples;


public class Example19 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("I Love");
        System.out.println("sb is "+sb);//I Love
        System.out.println("Its capacity is "+sb.capacity());//22
        System.out.println("Its length is "+sb.length());//6

        sb.append(" programming");
        System.out.println();
        System.out.println("sb is "+sb);//sb is I Love programming
        System.out.println("Its capacity is "+sb.capacity());//22
        System.out.println("Its length is "+sb.length());//18

        sb.append(" and problem solving");
        System.out.println();
        System.out.println("sb is "+sb);
        System.out.println("Its capacity is "+sb.capacity());//46
        System.out.println("Its length is "+sb.length());//38






    }
}