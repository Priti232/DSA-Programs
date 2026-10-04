package Stackdemo.stackimpl1;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of Stack");
        int size=kb.nextInt();
        Stack s=new Stack(size);
        for(int i=1;i<=size+1;i++){
            System.out.println("Enter element to push");
            int x=kb.nextInt();
            s.push(x);
            System.out.println("Element "+x+" pushed successfully");
        }
        for(int i=1;i<=size+1;i++){
            int x=s.pop();
            System.out.println("Element "+x+" popped successfully");
        }

    }
}
