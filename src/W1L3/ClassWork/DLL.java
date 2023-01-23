package W1L3.ClassWork;

public class DLL {
    //Double linked list Examples
    int data;
    DLL prev;
    DLL next;

    public DLL(int data){
        this(null,data,null);
    }

    public DLL(DLL prev, int data, DLL next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public String toString(){
        return data + " ";
    }
}
