package linkedlistdemo.llimpl5;
import java.util.Stack;

public class Linkedlist {
    private Node head;

    public Linkedlist(){
        head=null;
    }
    public void appendNode(int data){
        Node p=new Node(data);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
    }
    public void displayList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        }
    }
    public void printReverse(){
        Stack<Integer>stack=new Stack<>();
        Node temp=head;
        while(temp!=null){
            stack.push(temp.getData());
            temp=temp.getNext();
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+"->");
        }
    }
    public void reverse(){
        Node prev=null,current=head;
        Node next=null;
        while(current!=null){
            next=current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
        }
        head=prev;
    }
    public int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }
    public void deleteNthNodeFromLast(int pos){
        int nodeCount=countNodes();
        if(pos<=0 ||pos>nodeCount){
            throw new IllegalArgumentException("Invalid pos");
        }
        int diff=nodeCount-pos;
        int i=1;
        Node temp=head;
        while(i<diff){
            temp=temp.getNext();
            i++;
        }
        if(diff==0)
            head=head.getNext();
        else
            temp.setNext(temp.getNext().getNext());
    }
}


