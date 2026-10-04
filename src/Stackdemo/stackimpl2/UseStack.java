package Stackdemo.stackimpl2;

import java.rmi.RemoteException;
import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        var kb = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = kb.nextInt();
        Stack s = new Stack(size);
        for (int i = 1; i <= size + 1; i++) {
            System.out.println("Enter element to push");
            int x = Integer.parseInt(kb.next());
            s.push(x);
            System.out.println("Element" + x + "pushed sucessfully");
        }
        try {
            for (int i = 1; i <= size; i++) {
                int x = s.pop();
                System.out.println("Element" + x + "popped succesfully");
            }
        } catch (StackException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
