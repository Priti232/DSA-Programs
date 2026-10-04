package Stackdemo.stackimpl4;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        Stack s=new Stack();
        int choice,x;
        do{
            System.out.println("Select an operation:");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Quit");
            System.out.println("Enter your choice:");
            choice=kb.nextInt();
            switch(choice){
                case 1-> {
                    try {
                        System.out.println("Enter element to push:");
                        x = kb.nextInt();
                        s.push(x);
                        System.out.println("Pushed:" + x);
                    } catch (StackException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2->{
                    try{
                        x=s.pop();
                        System.out.println("Popped:"+x);
                    }catch(StackException e){
                        System.out.println(e.getMessage());
                    }
                }

                case 3->{
                    try{
                        x=s.peek();
                        System.out.println("Top element:"+x);
                    }catch(StackException e){
                        System.out.println(e.getMessage());
                    }
                }
                case 4-> {
                    System.out.println("Thank you!");
                }
                default-> System.out.println("Invalid choice! Try again");
            }
        }while(choice!=4);

    }

}


