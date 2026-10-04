package linkedlistdemo.llimpl3;

public class linkedlist {
    private Node head;

    public linkedlist(){
        head=null;
    }
    public void addAtPos(int data,int pos){
        int nodeCount=countNodes();
        if(pos<0 || pos>nodeCount){
            throw new IllegalArgumentException("Invalid position");
        }
        Node p=new Node(data);
        if(pos==0){
            p.setNext(head);
            head=p;
            return;
        }
        int i=0;
        Node temp=head;
        while(i<pos-1){
            i++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
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
    public int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }
    public void insert(int data){
        Node p=new Node(data);
        if(head==null){
            head=p;
            return;
        }
        if(data<=head.getData()){
            p.setNext(head);
            head=p;
            return;
        }
        Node temp=head,prev=null;
        while(temp!=null && temp.getData()<data){
            prev=temp;
            temp=temp.getNext();
        }
        if(temp==null){
            prev.setNext(p);
        }else{
            prev.setNext(p);
            p.setNext(temp);
        }

    }
}


