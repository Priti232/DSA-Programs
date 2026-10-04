package Stackdemo.stackimpl4;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> list;
    private int tos;
    public Stack(){
        list=new ArrayList<>();
        tos=-1;
    }
    public void push(int x){
        tos++;
        list.add(tos,x);

    }
    public int pop(){
        if(tos==-1){
            StackException ex=new StackException("Stack Underflow");
            throw ex;
        }
        int x=list.remove(tos);
        tos--;
        return x;
    }
    public int peek(){
        if(tos==-1){
            StackException ex=new StackException("Stack Underflow");
            throw ex;
        }
        int x=list.get(tos);
        return x;
    }

    public boolean empty() {
        return false;
    }
}


