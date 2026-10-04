package Stackdemo.stackimpl10;

import java.util.Stack;

public class ConvertExpression {
    private String infix;
    private String prefix;
    public ConvertExpression(String infix) {
        this.infix=infix;
        prefix ="";
    }
    public void convert(){
        //algo impl
        Stack<Character>s=new Stack<>();
        StringBuilder builder=new StringBuilder();
        for(int i=infix.length()-1;i>=0;i--){
            char ch=infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                builder.append(ch);
            }else{
                while(s.empty()==false){
                    if(precedence(ch)>=precedence(s.peek())){
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
        prefix =builder.reverse().toString();
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
        System.out.println("prefix:"+ prefix);
    }
}
