package linkedlistdemo.llimpl5;

import java.util.LinkedList;

public class UseLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        int n = 5;
        list.remove(list.size() - n);
        System.out.println("\nAfter deleting 5th node from last");
        System.out.println(list);

    }
}
