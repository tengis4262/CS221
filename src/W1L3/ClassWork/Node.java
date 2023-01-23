package W1L3.ClassWork;

public class Node {
    //instance fields
    String data;
    Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
        //this(data, null0;
    }
    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }
    @Override
    public String toString(){
        return data + " ";
    }
}
