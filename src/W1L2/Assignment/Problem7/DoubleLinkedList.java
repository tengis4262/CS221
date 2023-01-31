package W1L2.Assignment.Problem7;

public class DoubleLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    static class Node<E> {
        E item;
        private Node<E> next;
        private Node<E> prev;

        public Node( Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(E item) {
        Node<E> newNode = new Node<E>(null ,item, head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }
    public int getSize(){
        return size;
    }

    private void addAfter(Node<E> node, E item) {
        Node<E> newNode = new Node<E>(node, item, node.next);
        if (node.next != null) {
            node.next.prev = newNode;
        }
        node.next = newNode;
        if (node == tail) {
            tail = newNode;
        }
        size++;
    }

    public Node<E> getNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index Out Of Bound");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public E get(int index) {
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException(index);
        }
        return getNode(index).item;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }
        if (index == 0) {
            addFirst(item);
        } else {
            addAfter(getNode(index - 1), item);
        }
    }

    public boolean addLast(E item) {
        addAfter(tail, item);
        return true;
    }

    public boolean removeItem(E item) {
        Node<E> current = head;
        while (current != null) {
            if (current.item.equals(item)) {
                if (current == head) {
                    head = current.next;
                } else {
                    current.prev.next = current.next;
                }

                if (current == tail) {
                    tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString() {
        Node<E> current = head;
        String result = "";
        while (current != null) {
            result += current.item + " ";
            current = current.next;
        }
        return result +"\n";
    }
}
