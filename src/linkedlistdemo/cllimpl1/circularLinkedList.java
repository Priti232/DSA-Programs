package linkedlistdemo.cllimpl1;

public class circularLinkedList {
    private Node head;

    public circularLinkedList(){

        head=null;
    }
    public void appendNode(int data){
        Node p=new Node(data);
        if(head==null){
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while(temp.getNext()!=head){
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);
    }
    public void displayList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        } while(temp!=head);
    }
    public void prepend(int data){
        Node p=new Node(data);
        if(head==null){
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while(temp.getNext()!=head){
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);
        head=p;
    }
}

