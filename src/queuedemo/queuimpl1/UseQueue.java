package queuedemo.queuimpl1;


import java.util.Queue;
import java.util.Scanner;

public class UseQueue {
    public static void main(String []args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size");
        int size=kb.nextInt();
        int x,choice;
        queue queue=new queue(size);
        do{
            System.out.println("Select an option:");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Peek\n4.Quit");
            choice=kb.nextInt();
            switch(choice){
                case 1:
                    try{
                        System.out.println("Enter element to enqueue");
                        x=kb.nextInt();
                        queue.enqueue(x);
                        System.out.println("Element inserted!"+x);
                    }catch(QueueException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try{
                        x=queue.dequeue();
                        System.out.println("Element deleted!+x");
                    }catch(QueueException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try{
                        x=queue.peek();
                        System.out.println("Top element!:"+x);
                    }catch(QueueException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                        System.out.println("thank you for using this app!");
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }while(choice!=4);
    }
}
