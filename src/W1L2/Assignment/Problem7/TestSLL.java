package W1L2.Assignment.Problem7;

public class TestSLL {
        public static void main(String[] args) {
            SingleLinkedList sll = new SingleLinkedList();

            sll.add(5);
            sll.add(72);
            sll.add(12);
            sll.add(37);
            sll.add(31);
            sll.add(47);
            sll.add(50);

            sll.display();

            System.out.println("Max : " + sll.max());
            System.out.println("Min : " + sll.min());
            System.out.println("Size : " + sll.size());
            System.out.println("Find 37 : " + sll.find(37));
            System.out.println("Find 1 : " + sll.find(1));
        }
    }
