package queuedemo.queuetwostack;

public class UseQueue {
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        //System.out.println(obj.peek());
        while(!obj.isEmpty()){
            System.out.println(obj.dequeue());
        }
    }
}
