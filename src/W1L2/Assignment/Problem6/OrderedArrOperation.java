package W1L2.Assignment.Problem6;

import java.util.Arrays;

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
        System.out.println(arr);
        int searchKey = 33; // search for item
        int p = arr. BinarySearch (searchKey);
        if( p != -1 )
            System.out.println(searchKey + " is found in position : " + p);
        else
            System.out.println("Can’t find " + searchKey);
        arr.display(); // display items
        arr.delete(00); // delete 3 items
        arr.delete(55);
        arr.delete(99);
        System.out.println();

        arr.display(); // display items again
        System.out.println();
        System.out.println(arr);
    } // end main()
}
