package Stackdemo.stackimpl6;

import java.util.Stack;

public class EvaluateExpression {
    private String postfix;
    public EvaluateExpression(String postfix){

        this.postfix=postfix;
    }
    public double evaluate(){
        Stack<Double> stack=new Stack<>();
        char ch;
        for(char symbol:postfix.toCharArray()){
            if(Character.isDigit(symbol)){
                double x=symbol-'0';
                stack.push(x);
            }else{
                double op2=stack.pop();
                double op1=stack.pop();
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

