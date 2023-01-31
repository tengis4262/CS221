package W2L4.Assignment;

public class ListQueue<E> {
    // Data Fields
    /** Reference to front of queue. */
    private Node<E> front;
    /** Reference to rear of queue. */
    private Node<E> rear;
    /** Size of queue. */
    private int size;
    // Insert inner class Node<E> here (see Listing 2.1)
    /** A Node is the building block for a single-linked list. */
    private static class Node<E> {
        // 1. Design DLL Node Structure
        E item;
        Node<E> next, prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;


        }
    } //end class Node
    // Methods

    // 2. Implement offer method
    public boolean offer(E item) {
        //checking if List is empty
        if(front == null){
            rear = new Node<E>(null,item,null);
            front=rear;
        }else {
            rear.next = new Node<E>(rear,item,null);
            rear= rear.next;
        }
        size++;
        return true;
    }
    // 3. Implement poll method
    public E poll() {
        E item = peek();
        if (item == null) {
            return null;
        }
        front = front.next;
        size--;
        return item;
    }
    // 4. Implement peek method
    public E peek() {
        if(size == 0){
            return null;
        }
        return front.item;
    }

    public int size() {
        return size;
    }
    // 5. Implement isEmpty()
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
    // 6. Implement toString() to print data like [10 ==> 20 ==> 30 ==> 40]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = front;
        if (p != null) {
            while (p.next != null) {
                sb.append(p.item.toString());
                sb.append(" ==> ");
                p = p.next;
            }
            sb.append(p.item.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String args[]){
        ListQueue<Integer> lq = new ListQueue();
        lq.offer(10);
        lq.offer(20);
        lq.offer(30);
        lq.offer(40);
        lq.offer(50);
        lq.offer(60);
        lq.offer(70);

        System.out.println(lq);
        System.out.println("Peek Element : " + lq.peek());
        System.out.println("Size : " + lq.size());
        System.out.println("Poll : " + lq.poll());
        lq.poll();
        lq.poll();
        System.out.println(lq);
        System.out.println(lq.isEmpty());
        System.out.println("Poll : " + lq.poll());
        System.out.println(lq.isEmpty());
        System.out.println(lq.peek());





    }

}
