package linkedlistdemo.llimpl4;

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

        System.out.println("Removing 20: " + list.remove(Integer.valueOf(20)));
        System.out.println(list);

        System.out.println("Removing 10: " + list.remove(Integer.valueOf(10)));
        System.out.println(list);

        System.out.println("Removing 50: " + list.remove(Integer.valueOf(50)));
        System.out.println(list);

        System.out.println("Removing 50: " + list.remove(Integer.valueOf(50)));
        System.out.println(list); // Output: [30, 40]
    }
}
