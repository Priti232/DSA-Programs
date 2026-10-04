package Stackdemo.googleinterview;

import java.util.Stack;

public class MyStack {
    public static void sort(Stack<Integer>s1){
        Stack<Integer>s2=new Stack<>();
        while(!s1.isEmpty()){
            int x=s1.pop();
            while(!s2.isEmpty() && s2.peek()>x){
                s1.push(s2.pop());
            }
            s2.push(x);
        }
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>();
        s1.push(7);
        s1.push(3);
        s1.push(12);
        s1.push(5);
        sort(s1);
        System.out.println("After sorting");
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }

    }
}