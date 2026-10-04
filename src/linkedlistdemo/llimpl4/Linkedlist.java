package linkedlistdemo.llimpl4;

public class Linkedlist {
    private Node head;

    public void LinkedList(){
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
    public int removeFirst(){
        if(head==null){
            throw new IllegalStateException("List is empty");
        }
        int x=head.getData();
        head=head.getNext();;
        return x;
    }
    public int removeLast(){
        if(head==null){
            throw new IllegalStateException("List is empty");
        }
        int x;
        if(head.getNext()==null){
            x=head.getData();
            head=null;
            return x;
        }
        Node temp=head,prev=null;
        while(temp.getNext()!=null){
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(null);
        x=temp.getData();
        return x;
    }
    public int removeLast_2(){
        if(head==null){
            throw new IllegalStateException("List is empty");
        }
        int x;
        if(head.getNext()==null){
            x=head.getData();
            head=null;
            return x;
        }
        Node temp=head;
        while(temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
        x=temp.getNext().getData();
        temp.setNext(null);
        return x;
    }
    public boolean removeNode(int data){
        if(head==null){
            throw new IllegalStateException("List is empty");
        }
        if(head.getData()==data){
            head=head.getNext();
            return true;
        }
        Node temp=head,prev=null;
        while(temp!=null && temp.getData()!=data){
            prev=temp;
            temp=temp.getNext();
        }
        if(temp==null){
            return false;
        }
        prev.setNext(temp.getNext());
        return true;

    }
}

