package queuedemo.queueimpl5;


import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<Integer >queue=new PriorityQueue<>();//Priority Order , Growable Queue
        int choice,x;
        Scanner kb=new Scanner(System.in);
        do{
            System.out.println("Select an operation");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4.Quit");
            choice=kb.nextInt();
            switch(choice){
                case 1:
                    try {
                        System.out.println("Enter element:");
                        x = kb.nextInt();
                        queue.add(x);
                        System.out.println("Inserted:" + x);
                    }catch(IllegalStateException ex){
                        System.out.println("Queue overflow");
                    }
                    break;
                case 2:
                    try{
                        x=queue.remove();
                        System.out.println("Removed:"+x);
                    }catch(NoSuchElementException ex){
                        System.out.println("Queue is empty");
                    }
                    break;
                case 3:
                    try{
                        x=queue.element();
                        System.out.println("Top element:"+x);
                    }catch(NoSuchElementException ex){
                        System.out.println("Queue is empty");
                    }
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Wrong choice. Try Again");

            }
        }while(choice!=4);

    }
}
