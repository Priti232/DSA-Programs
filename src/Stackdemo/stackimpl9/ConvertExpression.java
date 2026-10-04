package Stackdemo.stackimpl9;

import java.util.Stack;

public class ConvertExpression {
    private String infix;
    private String postfix;
    public ConvertExpression(String infix) {
        this.infix=infix;
        postfix="";
    }
    public void convert(){
        //algo impl
        Stack<Character>s=new Stack<>();
        StringBuilder builder=new StringBuilder();
        for(char ch:infix.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                builder.append(ch);
            }else{
                while(s.empty()==false){
                    if(precedence(ch)>precedence(s.peek())){
                        break;
                    }else{
                        char x=s.pop();
                        builder.append(x);
                    }
                }
                s.push(ch);
            }
        }
        while(s.empty()==false){
            char x=s.pop();
            builder.append(x);
        }
        postfix=builder.toString();
    }
    public int precedence(char op){
        switch(op){
            case '$':
                return 3;
            case '/': case '*': case '%':
                return 2;
            case '+': case '-':
                return 1;
            default:
                return 0;


        }

    }
    public void display(){
        System.out.println("infix:"+infix);
        System.out.println("postfix:"+postfix);
    }
}

