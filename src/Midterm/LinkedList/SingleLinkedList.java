package Midterm.LinkedList;

public class SingleLinkedList<E> {
    private Node<E> head = null;
    private int size = 0;

    private static class Node<E>{
        private Node<E> next;
        private E data;


        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }

        public Node(E data){
            this(data,null);
        }
    }

    public void addFirst(E item){
        head = new Node(item,head);
        size++;
    }
    private void addAfter(Node<E> node, E item){
        node.next = new Node(item,node.next);
        size++;
    }
    public E removeFirst(){
        Node<E> delData = head;
        if(head!= null){
            head = head.next;
            size--;
            return delData.data;
        }
        return null;
    }

    public E removeAfter(Node<E> node){
        Node<E> old = node.next;
        if(old!= null){
            node.next = old.next;
            size--;
            return old.data;
        }else
        return null;
    }
    public Node<E> getNode(int index){
        Node<E > node = head;
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException(index);
        }
        for (int i = 0; i < index && head!=null; i++) {
            node = node.next;
        }
        return node;
    }

    public E get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException(index);
        }
        Node<E> node = getNode(index);
        return node.data;
    }

    public E set(int index, E item){
        if(index<0 || index>= size){
            throw new IndexOutOfBoundsException(index);
        }
        Node<E> node = getNode(index);
        E result = node.data;
        node.data = item;
        return result;
    }
    public void add(int index,E item){
        Node<E> node = null;
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException(index);
        }
        if(index==0){
            addFirst(item);
        } else
            node = getNode(index-1);
        addAfter(node,item);
        }

    public boolean addLast(E item){
        add(size,item);
        return true;
        }
    public E remove(int index){
        Node<E> old = getNode(index);
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException(index);
        }
        if(index==0){
            removeFirst();
        }else {
            Node<E> node = getNode(index - 1);
            removeAfter(node);
        }
        return old.data;
    }

}
