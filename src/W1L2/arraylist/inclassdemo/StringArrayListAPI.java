package W1L2.arraylist.inclassdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayListAPI {

	public static void main(String[] args) {
	
	// Create a ArrayList - To acheive polymorphism declare with List Type
		// Default capacity 10
	List<String> prog = new ArrayList<>(); // ArrayList
	// If you know the capacity
	ArrayList<Integer> nums = new ArrayList<>(18);
	//ArrayList<int> nums1 = new ArrayList<>(18); // error, primitive not allowed
	
	int[] x = new int[10]; // Array
	
	// How to add elements in your prog list
	
	// 1. add element into the end of the list
	prog.add("C++"); // oth pos
	prog.add("Java"); // 1st pos
	System.out.println(prog);
	
	// 2. add element into the specific position
	// Position is in the range of 0 to size-1
		
	prog.add(1, "Python");
	//prog.add(5,"Spring"); // Throw Runtime error - IndexOutOfBounds
	System.out.println(prog);
	
	// 3. To know the size of the list, size is how many elements cyrrently hold
	// Capacity --> How much memory allocated 
	// As of in this line no, capacity is 10
	// Size is 3
	System.out.println("Size  = "+prog.size());
	
	// 4. remove(index) ; index range 0 to size-1 
	System.out.println("Before Removing 0 th pos " + prog);
	prog.remove(0);
	System.out.println("After Removing 0 th pos " + prog);
	
	// 5. remove(value) --> Check the value exists, if yes removed and return true otherwise false
	boolean sta = prog.remove("Java");
	System.out.println(prog +   "\n status = " + sta);
	// 6. Retrieve an element with specific position use get method 
	prog.add("Android");
	prog.add("Kotlin");
	prog.add("Android");
	prog.add("Kotlin");
	System.out.println(prog);
	System.out.println(prog.get(1)); // range 0 to size-1
	
	//7. indexOf-> Search an element from left to right
	//8. lastIndexof --> Search from right to left
	// Return the position of value if exist otherwise -1
	System.out.println(prog);
	System.out.println(prog.indexOf("Android"));
	System.out.println(prog.lastIndexOf("Android"));
	System.out.println(prog.indexOf("Andriod1"));
	
	// 9. How to declare and initialize ArrayList at one step
	ArrayList<Integer> coll = new ArrayList<>(Arrays.asList(
			12,15,23,45));
	
	// 10. Find the sum of Integer list, index approach or for each
	int sum = 0;
	for(int i = 0;i<coll.size();i++)
		sum+=coll.get(i);
	System.out.println("Sum = " + sum);
	sum = 0;
	for(Integer n:coll) {
		sum+= n;
	}
	System.out.println("Sum = " + sum);
	
	//12. clear/removeAll(), isEmpty()
	System.out.println(coll.isEmpty());
	coll.clear();
	System.out.println(coll.size());
	System.out.println(coll.isEmpty());
	
	// 13. Work with DirectoryEntry list
	List<DirectoryEntry> dir = new ArrayList<>();
	dir.add(new DirectoryEntry("Renuka","641472700"));
	DirectoryEntry e1 = new DirectoryEntry("Tim","6414347890");
	dir.add(e1);
	System.out.println(dir);
	
	// If you want to work with indexOf, contains, lastIndexof, remove 
	// You have to override equals inside DirectoryEntry class
	
	
	}

}
