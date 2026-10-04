package Stackdemo.stackimpl6;

import java.util.Scanner;

public class UseEvaluateExpression {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str;
        System.out.println("Enter a valid postfix expression:");
        str=kb.next();
        EvaluateExpression eval=new EvaluateExpression(str);
        System.out.println("Answer:"+eval.evaluate());


    }
}

