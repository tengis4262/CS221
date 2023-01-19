package W1L2.Assignment.Problem1;


import java.util.Arrays;

public class KWArrayListInt {
    private int size=0;
    int[] theData;
    final int initialCapacity =10;
    int capacity;



    public KWArrayListInt() {
        capacity= initialCapacity;
        size = 0;
        theData = new int[capacity];

    }
    public KWArrayListInt(int a) {
        size = 0;
        theData = new int[a];

    }

    public void add(int a){
        if(a==0)
            return;
        if(size == capacity){
            reallocate();
        }
        theData[size]=a;
        size++;
    }
    public int size() {
        return size;
    }
    private void reallocate() {
        capacity = 2 * theData.length;
        theData = Arrays.copyOf(theData, capacity);

    }
//    public void removeDuplicate(){
//        for (int i = 0; i < size; i++) {
//            if(theData[i]==theData[i+1])
//        }
//    }
    public void removeAll(){
        for (int i = 0; i <size ; i++) {
            theData[i]=0;
        }
        size=0;
    }
    public int removeIndexOf(int index) {
        if (index < 0 || index >= size)
            return 0;
       int old = theData[index];
        for(int i = index+1; i<size; i++) {
            theData[i-1] = theData[i];
        }
        size--;
        return old;
    }
    public void removeDuplicates(){
        for (int i = 0; i < theData.length; i++) {
            for (int j = i+1; j <theData.length ; j++) {
                if(theData[i]==theData[j])
                    removeIndexOf(i);
            }
        }
    }

    public int set(int index, int num){
        if(index<0 || index>=size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        int old = theData[index];
        theData[index] = num;
        return old;
        }
    public int[] sublist(int si, int ei){
        if(si<0  || si>=size ){
            throw new ArrayIndexOutOfBoundsException(si);
        }
        if(ei<0 ||ei>=size){
            throw new ArrayIndexOutOfBoundsException(ei);
        }
        int[] temp = new int [size] ;
        temp = Arrays.copyOfRange(theData,si,ei);
        return temp;
    }
    public int getIndexOf(int index){
        int loc = 0;
        if(index<0 || index>=size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        for (int i = 0; i < size; i++) {
            if(i==index)
                loc = i;
        }
        return theData[loc];
    }
    public String toString(){
        if(size==0)
            return null;
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1; ++i){
            sb.append(theData[i]+", ");
        }
        sb.append(theData[size-1]+"]");
        return sb.toString();
    }



}
