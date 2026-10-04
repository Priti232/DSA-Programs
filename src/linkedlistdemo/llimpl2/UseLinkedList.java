package linkedlistdemo.llimpl2;

import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
//        list.appendNode(10);
//        list.appendNode(20);
//        list.appendNode(30);
//        list.appendNode(40);
//        list.appendNode(50);
        list.remove(10);
        list.remove(20);
        list.remove(30);
        list.remove(40);
        list.remove(50);
        System.out.println(list);
        System.out.println("\nTotal nodes: " + list.size());
    }
}
