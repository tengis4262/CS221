package W1L2.Assignment.Problem7;

public class TestDLL {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> dll = new DoubleLinkedList<>();

        dll.addFirst(7);
        dll.addFirst(3);
        dll.addFirst(18);

        System.out.println(dll.toString());

        dll.addLast(20);
        System.out.println(dll.toString());

        dll.add(1, 9);
        System.out.println(dll.toString());

        int element = dll.get(1);
        System.out.println("Element at index 1: " + element);

        System.out.println("List: " + dll);

        dll.removeItem(3);
        System.out.println("List after removing 3: " + dll);

        DoubleLinkedList.Node<Integer> node = dll.getNode(3);
        System.out.println("Node at index 3: " + node.item);




    }
}
