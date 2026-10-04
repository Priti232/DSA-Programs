package queuedemo.queueimpl2;

import queuedemo.queuimpl1.QueueException;

public class Queue {
    private int [] arr;
    private int front,rear;
    private int size;
    public Queue(int size){
        arr=new int [size];
        this.size=size;
        rear=-1;
        front=-1;
    }
    public void enqueue(int data){
        if((rear==size-1 && front==0)||(rear+1==front)){
            throw new QueueException("Queue Overflow");
        }
        if(rear==size-1)
            rear=0;
        else
            rear++;
        arr[rear]=data;
        if(front==-1)
            front=0;
    }
    public int dequeue(){
        if(front==-1){
            throw new QueueException("Queue Underflow");
        }
        int x=arr[front];
        if(front==rear){
            front=rear-1;
        }else if(front==size-1){
            front=0;
        }else{
            front++;
        }return x;
    }
    public int peek(){
        if(front==-1){
            throw new QueueException(("Queue Underflow"));
        }
        int x =arr[front];
        return x;
    }
}
