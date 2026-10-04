package Stackdemo.stackimpl5;

public class Demo {
    public static void m1(){
        System.out.println("Good Morning!");
    }
    public static void m2(){
        m1();
        System.out.println("Good Afternoon!");
    }

    public static void main(String [] args){
        m2();
        System.out.println("Good Night!");
    }
}

