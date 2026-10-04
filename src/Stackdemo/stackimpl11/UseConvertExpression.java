package Stackdemo.stackimpl11;

import java.util.Scanner;

public class UseConvertExpression {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String exp;
        System.out.println("Enter a valid infix exp");
        exp=kb.next();
        ConvertExpression cexp=new ConvertExpression(exp);
        cexp.convert();
        cexp.display();
    }
}
