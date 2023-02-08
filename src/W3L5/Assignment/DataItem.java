package W3L5.Assignment;

import java.io.IOException;
import java.util.Scanner;

public class DataItem {
    // (could have more data)
    private int iData;               // data item (key)
    private String value;
    //--------------------------------------------------------------
    public DataItem(int ii, String v)          // constructor
    { iData = ii;
        value = v;
    }
    //--------------------------------------------------------------
    public int getKey()
    { return iData; }
    public String getValue()
    { return value; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////
class HashTable
{
    private DataItem[] hashArray;    // array holds hash table
    private int arraySize;
    private DataItem nonItem;     // for deleted items

    private int size = 0;
    //-------------------------------------------------------------
    public HashTable(int sz)       // constructor
    {
        arraySize = sz;
        hashArray = new DataItem[arraySize];
        nonItem = null;   // deleted item key is null
    }
    //-------------------------------------------------------------
    public void displayTable()
    {
        System.out.println("Table: ");
        for(int j=0; j<arraySize; j++)
        {
            if(hashArray[j] != null)
                System.out.println("Index : " + j + " " + hashArray[j].getKey() + " " + hashArray[j].getValue());
            else
                System.out.println("Index : " + j + " " + "**");
        }
        System.out.println("");
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public void rehash(){

        int oldArraySize = arraySize;
        arraySize = (arraySize*2)+1;

        DataItem[] oldArr =hashArray;
        hashArray =new DataItem[arraySize];
        System.out.println("Rehash activated");
//
//        System.out.println(oldArr.length);
//        System.out.println(hashArray.length);
//        System.out.println(arraySize + " " + size);

        for (int i = 0; i < oldArraySize; i++) {
            if(oldArr[i] !=null){
                insert(oldArr[i].getKey(),oldArr[i].getValue());
            }
        }
    }


    //-------------------------------------------------------------
    public int hashFunc(int key)
    {

        return key % arraySize;       // hash function
    }
    //-------------------------------------------------------------
    public void insert(int key, String v) // insert a DataItem
// (assumes table not full)
    {

        // extract key
        // until empty cell
// an index have some data and not match with existing key, it find next vacant position
        if(size >= (arraySize/4)*3){
            rehash();
        }
        int hashVal = hashFunc(key);  // hash the key

        while(hashArray[hashVal] != null &&
                hashArray[hashVal].getKey() != key)
        {
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }

        DataItem obj = new DataItem(key,v);
        hashArray[hashVal] = obj; // insert item
        size++;
    }  // end insert()
    //-------------------------------------------------------------
    public DataItem delete(int key)  // delete a DataItem
    {
        int hashVal = hashFunc(key);  // hash the key

        while(hashArray[hashVal] != null)  // until empty cell,
        {                               // found the key?
            if(hashArray[hashVal].getKey() == key)
            {
                DataItem temp = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem;       // delete item
                return temp;                        // return item
            }
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return null;                  // can't find item
    }  // end delete()
    //-------------------------------------------------------------
    public boolean find(int key)    // find item with key
    {
        int hashVal = hashFunc(key);  // hash the key

        while(hashArray[hashVal] != null)  // until empty cell,
        {                               // found the key?
            if(hashArray[hashVal].getKey() == key)
                return true;   // yes, return item
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return false;                  // can't find item
    }
//-------------------------------------------------------------
}  // end class HashTable
////////////////////////////////////////////////////////////////
class HashTableApp
{
    public static void main(String[] args) throws IOException
    {
        int aKey;
        String value;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of hash table: ");
        int size = in.nextInt();

        HashTable theHashTable = new HashTable(size);

        theHashTable.insert(1,"FPP");
        theHashTable.insert(5,"Java");
        theHashTable.insert(7,"SE");
        theHashTable.insert(10,"C#");

        while(true)                   // interact with user
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = in.next().charAt(0); //Read a Char from the console
            switch(choice)
            {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key and value to insert: ");
                    aKey = in.nextInt();
                    value = in.next();
                    theHashTable.insert(aKey,value);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = in.nextInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = in.nextInt();
                    System.out.println("Key Found status : " + theHashTable.find(aKey));
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
}
