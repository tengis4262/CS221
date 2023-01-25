package W1L2.Assignment.Problem7;

public class SingleLinkedList {
    private class Node{
        private int data;
        private Node next;

        private Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        private Node(int data){
            this(data,null);
        }
    }
    private Node head;
    private int size;

    public SingleLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void add(int item){
        Node n = new Node(item,head);
        head = n;
        size++;
    }

    public int size(){
        return size;
    }

    public boolean find(int item){
        Node temp = head;
        while(temp!=null){
            if(temp.data==item){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int max(){
        Node temp = head;
        if(temp==null){
            return -1;
        }
        else {
            int max = temp.data;
            while(temp!=null){
                if(temp.data>max){
                    max=temp.data;
                }
                temp=temp.next;
            }
            return max;
        }
    }

    public int min(){
        Node temp = head;
        if(temp==null){
            System.out.println("Empty");
            return -1;
        }
        else {
            int min = temp.data;
            while (temp!=null){
                if(temp.data < min){
                    min = temp.data;;
                }
                temp = temp.next;
            }
            return min;
        }
    }

    public void display(){
        if(head==null){
            return;
        }
        else {
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }



}
