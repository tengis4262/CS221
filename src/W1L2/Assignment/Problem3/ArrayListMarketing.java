package W1L2.Assignment.Problem3;

import java.util.ArrayList;

public class ArrayListMarketing {

    Marketing m;

    ArrayList<Marketing> arr;
    public ArrayListMarketing(){
        arr = new ArrayList();
    }
    public void add(Marketing marketing){
        arr.add(marketing);
    }
    public void remove(int index){
        arr.remove(index);
    }
    public void set(int index,Marketing marketing){
        arr.set(index,marketing);
    }


    public void add(Marketing e ){
        arr.add(e);
    }


}
