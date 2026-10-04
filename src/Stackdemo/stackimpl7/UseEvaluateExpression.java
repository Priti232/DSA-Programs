package Stackdemo.stackimpl7;


import java.util.Scanner;

public class UseEvaluateExpression {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str;
        System.out.println("Enter a valid prefix expression:");
        str=kb.next();
        EvaluateException eval=new EvaluateException(str);
        System.out.println("Answer:"+eval.evaluate());


    }
}

