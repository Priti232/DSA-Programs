package stringexamples;

public class Example18 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println("sb1 is "+sb1);//sb1 is
        System.out.println("Its capacity is "+sb1.capacity());//its capacity is 16
        System.out.println("Its length is "+sb1.length());//its length is 0

        StringBuffer sb2=new StringBuffer(40);
        System.out.println("sb2 is "+sb2);//sb2 is
        System.out.println("Its capacity is "+sb2.capacity());//its capacity is 40
        System.out.println("Its length is "+sb2.length());//its length is 0

        StringBuffer sb3=new StringBuffer("Welcome");
        System.out.println("sb3 is "+sb3);//sb3 is Welcome
        System.out.println("Its capacity is "+sb3.capacity());//23
        System.out.println("Its length is "+sb3.length());//7

    }
}

