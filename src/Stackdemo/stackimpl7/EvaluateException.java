package Stackdemo.stackimpl7;

import java.util.Stack;

public class EvaluateException {
    private String prefix;
    public EvaluateException(String prefix){

        this.prefix =prefix;
    }
    public double evaluate(){
        Stack<Double> stack=new Stack<>();
        char ch;
        for(int i=prefix.length()-1;i>=0;i--){
            char symbol=prefix.charAt(i);
            if(Character.isDigit(symbol)){
                double x=symbol-'0';
                stack.push(x);
            }else{
                double op1=stack.pop();
                double op2=stack.pop();
                double ans=calculate(op1,op2,symbol);
                stack.push(ans);
            }
        }
        return stack.pop();
    }
    public double calculate(double op1,double op2,char op){
        switch(op){
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '/':
                return op1/op2;
            case '%':
                return op1%op2;
            case '$':
                return Math.pow(op1,op2);
            default:
                return 0.0;
        }


    }
}

