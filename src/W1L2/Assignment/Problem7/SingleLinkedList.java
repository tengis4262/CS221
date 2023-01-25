package W1L2.Assignment.Problem7;

public class SingleLinkedList<Integer> {

    public static class Node<Integer>{
        private Integer data;
        private Node<Integer> next = null;

        public Node(Integer data , Node<Integer> next){
            this.data = data;
            this.next = next;
        }
        public Node(Integer data){
            this.data = data;
        }
        private Node<Integer> head = null;
        private int size = 0;

        private void addFirst(Integer item) {
            head = new Node<Integer>(item, head);
            size++;
        }
        int size() {
            return size;
        }
        private Node<Integer> getNode(int index) {
            Node<Integer> node = head;
            for (int i = 0; i < index && node != null; i++) {
                node = node.next;
            }
            return node;
        }
        public Integer get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException(java.lang.Integer.toString(index));
            }
            Node<Integer> node = getNode(index);
            return node.data;
        }
        public Integer findMax(){

        }
        public boolean find(int item){
            for (int i = 0; i < size; i++) {


            }
            return true;

        }


    }

}
