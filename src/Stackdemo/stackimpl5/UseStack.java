package Stackdemo.stackimpl5;

import Stackdemo.stackimpl4.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        while (!st.empty()) {
            System.out.println(st.pop());
        }
    }
}

