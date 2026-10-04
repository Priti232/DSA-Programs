package queuedemo.queuetwostack;


import java.util.Stack;

public class Queue {
    private Stack<Integer>s1;
    private Stack<Integer> s2;
    public Queue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void enqueue(int data){
        s1.push(data);
    }
    public int dequeue(){
        if(s1.isEmpty()){
            throw new RuntimeException("Queue underflow");
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int x=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x;
    }
    public int peek(){
        if(s1.isEmpty()){
            throw new RuntimeException("Queue underflow");
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int x=s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x;
    }
    public boolean isEmpty(){
        return s1.isEmpty();
    }
}

