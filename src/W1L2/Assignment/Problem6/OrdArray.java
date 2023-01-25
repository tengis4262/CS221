package W1L2.Assignment.Problem6;

import java.util.Arrays;

public class OrdArray<E> {
    private long[] a; // ref to array a
    private int nElems; // number of data items
    //-----------------------------------------------------------
    public OrdArray(int max) // constructor
    {
        a = new long[max]; // create array
        nElems = 0;
    }
    //-----------------------------------------------------------
    public int size()
    {
        return nElems;
    }
    //-----------------------------------------------------------
    public int BinarySearch(long searchKey)
    {
        int fIndex=0;
        int lIndex =nElems;
        while (fIndex< lIndex){
            int mid=(lIndex +fIndex)/2;
            if(a[mid]==searchKey) {
                return mid;
            }
            else if (a[mid]<searchKey) {
                fIndex = mid + 1;
            }
            else {
                lIndex = mid - 1;
            }

        }
        return -1;
    }// end BinarySearch()
    //-----------------------------------------------------------
    public void insert(long value) // Elements should be inserted in a sorted order
    {
        if(nElems==a.length)
            reallocate();
        int i;
        for ( i = 0; i < nElems; i++) {
            if (a[i] > value) {
                break;
            }
        }
        for (int k = nElems; k >=i ; k--) {
            a[k+1]=a[k];
            }
            a[i] = value;
            nElems++;
        }
    // end insert()
    //-----------------------------------------------------------
    public boolean delete(long value)
    {
        int j = BinarySearch(value);
        if(j==nElems) // can’t find it
            return false;
        else // found it
        {
            for(int k=j; k<nElems; k++) // move bigger ones down
                a[k] = a[k+1];
            nElems--; // decrement size
            return true;
        }
    } // end delete()
    //-----------------------------------------------------------
    public void display() // displays array contents
    {
        for(int j=0; j<nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
    }
//-----------------------------------------------------------
@Override
public String toString() {
    String res = "";
    for(int j=0; j<nElems; j++) // for each element,
        res = res + a[j] + " ";
//System.out.print(a[j] + " "); // display it
    return "OrdArray [" + res + "]";
}
    public void reallocate(){
        nElems=2*a.length;
        a= Arrays.copyOf(a,nElems);
    }

} // end class OrdArray

