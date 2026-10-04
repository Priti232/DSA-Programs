package linkedlistdemo.llimpl3;


public class UseLinkedlist {
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insert(5);
        list.insert(12);
        list.insert(2);
        list.insert(11);
        list.insert(4);
        list.displayList();
        System.out.println("\nTotal nodes:"+list.countNodes());
    }
}



