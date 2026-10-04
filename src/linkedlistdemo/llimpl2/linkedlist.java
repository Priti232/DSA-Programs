package linkedlistdemo.llimpl2;

public class linkedlist {
    private Node head;

    public linkedlist(){
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
    public int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }
    public int searchNode(int data){
        if(head==null){
            return 0;
        }
        int pos=0;
        Node temp=head;
        while(temp!=null){
            pos++;
            if(temp.getData()==data){
                return pos;
            }
            temp=temp.getNext();
        }
        return -1;
    }
    public void prependNode(int data){
        Node p=new Node(data);
        p.setNext(head);
        head=p;
    }
}
