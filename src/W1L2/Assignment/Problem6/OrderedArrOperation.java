package W1L2.Assignment.Problem6;
class OrdArray
{
    @Override
    public String toString() {
        String res = "";
        for(int j=0; j<nElems; j++) // for each element,
            res = res + a[j] + " ";
//System.out.print(a[j] + " "); // display it
        return "OrdArray [" + res + "]";
    }
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
    { return nElems; }
    //-----------------------------------------------------------


    /* IMPLEMENT */
    public int BinarySearch(long [] a,long searchKey){
        int lo = 0;
        int hi = a.length;
        while (lo < hi) {

            int i = (lo + hi) / 2;
            if (a[i] == searchKey) {
                return i;
            } else if (a[i] < searchKey) {
                lo = i + 1;
            } else {
                hi = i - 1;
            }
        }
        return -1;
    } // end BinarySearch()
    //-----------------------------------------------------------
    public void insert(long value) // Elements should be inserted in a sorted order
    {


    } // end insert()
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
} // end class OrdArray
////////////////////////////////////////////////////////////////
public class OrderedArrOperation {
    public static void main(String[] args)
    {
        int maxSize = 100; // array size
        OrdArray arr; // reference to array
        arr = new OrdArray(maxSize); // create the array
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        int searchKey = 33; // search for item
        int p = arr. BinarySearch (searchKey);
        if( p != -1 )
            System.out.println(searchKey + " is found in position : " + p);
        else
            System.out.println("Can’t find " + searchKey);
//arr.display(); // display items
        arr.delete(00); // delete 3 items
        arr.delete(55);
        arr.delete(99);
//arr.display(); // display items again
        System.out.println(arr);
    } // end main()
} // end class OrderedApp
/////