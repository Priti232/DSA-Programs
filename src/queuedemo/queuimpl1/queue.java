package queuedemo.queuimpl1;

public class queue {
    private int [] arr;
    private int front,rear;
    private int size;
    public queue(int size){
        arr=new int [size];
        this.size=size;
        rear=-1;
        front=0;
    }
    public void enqueue(int data){
        if(rear==size-1){
            throw new QueueException("Queue overflow");
        }
        rear++;
        arr[rear]=data;
    }
    public int dequeue(){
        if(front>rear){
            throw new QueueException("Queue Underflow");
        }
        return arr[front++];
    }
    public int peek(){
        if(front>rear){
            throw new  QueueException("Queue Underflow");
        }
        return arr[front];
    }
}

