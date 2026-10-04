package linkedlistdemo.cllimpl1;

public class UseCircularLinkedlist {
    public static void main(String[] args) {
        circularLinkedList list=new circularLinkedList();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.appendNode(40);
        list.appendNode(50);
//        list.prependNode(10);
//        list.prependNode(20);
//        list.prependNode(30);
//        list.prependNode(40);
//        list.prependNode(50);
        list.displayList();
        //System.out.println("\nTotal nodes:"+list.countNodes());
    }
}