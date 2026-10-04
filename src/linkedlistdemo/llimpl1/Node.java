package linkedlistdemo.llimpl1;

public class Node {
    int data;
    Node next;
}

class UseNode{
    public static void main(String[] args) {
        Node head;
        head=new Node();
        head.data=10;

        Node sec=new Node();
        sec.data=20;
        head.next=sec;

        Node third=new Node();
        third.data=30;
        sec.next=third;

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

    }
}
