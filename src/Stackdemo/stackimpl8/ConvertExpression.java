package Stackdemo.stackimpl8;

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
                    boolean result=precedence(ch,s.peek());
                    if(result==true){
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
    public boolean precedence(char out,char in){
        if(in=='$')
            return false;
        else if(out=='$')
            return true;
        else if(in=='/'||in=='*'||in=='%')
            return false;
        else if(out=='/'||out=='*'||out=='%')
            return true;
        else if (in=='+'|| in=='-')
            return false;
        else
            return true;

    }
    public void display(){
        System.out.println("infix:"+infix);
        System.out.println("postfix:"+postfix);
    }
}

