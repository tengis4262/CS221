package W1L2.arraylist.inclassdemo;

import java.util.Arrays;

public class KWArrayListString {
	// Instance fields
	private int size;
	final int CAPACITY=10;
	String[] theData;
	public KWArrayListString() {
		size = 0;
		theData = new String[CAPACITY];
		
	}
	public KWArrayListString(int c) {
		size = 0;
		theData = new String[c];
		
	}
	// Behaviours
	
	public void add(String s) {
		if(s==null)
			return;
		if (size == CAPACITY) {
            reallocate();
            System.out.println("Resized");
        }
        theData[size] = s;
        size++;
		
	}
	public int size() {
		return size;
	}
	public String get(int pos) {
		if(pos<0 || pos > size-1)
			throw new ArrayIndexOutOfBoundsException(pos); 
		return theData[pos];
		
	}
	public boolean isEmpty() {
		if(size==0)
			return true;
		else
			return false;
		// return (size==0);
		
	}
	public int indexOf(String val) {
		if(val==null)
			return -1;
		for(int i=0;i<size;i++) {
			if(val.equals(theData[i]))
				return i;
		}
		return -1;
		
	}
	public String set(int index, String val) {
		if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
		String old = theData[index];
		theData[index] = val;
		return old;
		
	}
	
	public void add(int index,String val) {
		
		if (index < 0 || index >= size) {
            return;
        }
		if (size == CAPACITY) {
            reallocate();
            System.out.println("Resized");
        }
		for(int i =size ; i>index;i--) {
			theData[i] = theData[i-1];
		}
		theData[index] = val;
		size++;
		
	}
	
	
	
	public String remove(int index) {
		if (index < 0 || index >= size) 
            return null;
         String old = theData[index];
         for(int i = index+1; i<size; i++) {
        	 theData[i-1] = theData[i];
        	 
         }
         size--;
         return old;
         
     }
	
		
	
	private void reallocate() {
		 int capacity = 2 * theData.length;
	     theData = Arrays.copyOf(theData, capacity);
		
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(theData[i]+", ");
		}
		sb.append(theData[size-1]+"]");
		return sb.toString();
	}
}
