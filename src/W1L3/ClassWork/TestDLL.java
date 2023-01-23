package W1L3.ClassWork;

public class TestDLL {
    Node header;
    public TestDLL(){
        header = null;
    }
    public class Node{
        String value;
        Node prev, next;

        public Node(Node prev, String value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        public String toString(){
            return value;
        }

    }
    public void addFront(String item){
        //list empty
        if(header == null){
            header = new Node(null,item,null);
        }
        else {
            Node n = new Node(null, item, header);
            header.prev = n;
            header = n;
        }

    }
    public Node findLast(){
        if(header == null)
            return null;
        else{
            Node temp = header;
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp;
        }
    }
    public boolean findItem(String item){
        if(header == null)
            return false;
        Node temp = header;
        while (temp!=null){
            if(item.equals(temp.value))
                return true;
            else temp = temp.next;
        }
        return false;
    }
    public void addLast(String item){
        if(header == null){
            header = new Node(null,item,null);
        }
        else{
            Node last = findLast();
            Node n = new Node(last,item,null);
            last.next = n;


        }
    }
    public void preAddNode(Node n, String item){
            if(n==null)
                return;
            if(n.prev==null)
                addFront(item);
            else {
                Node bn = new Node(n.prev, item, n);
                n.prev.next = bn;
                n.prev = bn;
            }
    }
    public void postAddNode(Node n, String item){
        if(n==null)
            return;
        if(n.prev==null)
            addLast(item);
            if(n.next==null)
                addLast(item);
        else {
            Node an = new Node(n,item,n.next);
            n.next =an;
            n.next.prev=an;
        }
    }

    public void deleteNode(Node n){
        if(header != null && n != null){
            //case 1 if list is empty
            if(n.prev ==null && n.next==null){
                header = null;
                n=null;
            }
            else if(n.prev == null)
                header = header.next;
            else if(n.next==null)
                n.prev.next = null;
            else {
                n.prev.next = n.next;
                n.next.prev = n.prev;
                n=null;
            }

        }
    }
    public String toString(){
        String str = "";
        Node temp = header;
        while (temp != null){
            str = str + "[" + temp.value.toString() + "]" + "-->";
            temp = temp.next;
        }
        str = str + "[" + "NULL" + "]";
        return str;
    }
    public static void main(String[] args) {

        TestDLL ob = new TestDLL();


        ob.addFront("Java");
        ob.addFront("C++");
        ob.addFront("JavaScript");
        System.out.println(ob);
        System.out.println(ob.findLast());

        System.out.println(ob.findItem("Java"));
        ob.addLast("Android");
        System.out.println(ob);







       /*
        DLL n1 = new DLL(10);
        DLL n2 = new DLL(20);
        DLL n11 = new DLL(n1,30,n2);

        n1.prev = null;
        n1.next =n2;
        n2.prev = n1;

        System.out.println(n1);
        System.out.println(n1.next);
        System.out.println(n2.prev);

        n1.next = n11;
        n2.prev = n11;
        System.out.println(n11);
        System.out.println(n11.prev);
        System.out.println(n11.next);
        System.out.println(n2.prev);

        */

    }
}
