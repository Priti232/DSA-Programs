package Stackdemo.stackimpl3;

public class Stack {
    private int []arr;
    private int tos;
    private int size;
    public Stack(int size){
        arr=new int[size];
        this.size=size;
        tos=-1;
    }
    public void push(int x){
        if(tos==size-1){
            StackException ex=new StackException("Stack Overflow");
            throw ex;
        }
        arr[++tos]=x;
    }
    public int pop(){
        if(tos==-1){
            StackException ex=new StackException("Stack Underflow");
            throw ex;
        }
        return arr[tos--];
    }
    public int peek(){
        if(tos==-1){
            StackException ex=new StackException("Stack Underflow");
            throw ex;
        }
        return arr[tos];
    }
}
