package W1L3.ClassWork;

public class TestSLL {
    public static void main(String[] args) {
        Node n1 = new Node("AA");
        Node n2 = new Node("BB");
        Node n3 = new Node("CC");

        n1.next = n2;
        n2.next = n3;
//        System.out.println(n1);
//        System.out.println(n1.next);
//        System.out.println(n2.next);
//        System.out.println(n1.next.next); // n1-->n2-->n3

        Node n11 = new Node("AAA",n2);
        n1.next = n11;
//        System.out.println(n1.next);
//        System.out.println(n2.next);
        System.out.println();
        for (Node n=n1;n!=null;n= n.next) {
            System.out.print(n);
        }
        System.out.println();
        Node n = n1;
        while(n!=null){
            System.out.print(n);
            n=n.next;
        }
    }
}
