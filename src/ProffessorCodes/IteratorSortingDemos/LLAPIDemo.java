package ProffessorCodes.IteratorSortingDemos;

import java.util.*;

public class LLAPIDemo {

	public static void main(String[] args) {
		
		
		LinkedList <Integer>list = new LinkedList<Integer>();
		// Adding Elements 
		list.add(10);// Add into the end
		list.add(20);
		list.addLast(30);
		list.addFirst(5);
		System.out.println(list);
		System.out.println(list.size());
		
		/*list.remove();// Remove the first element
		list.remove(2);
		System.out.println("After Remove");
		System.out.println(list);
		System.out.println(list.size());*/
		ArrayList<String> al = new ArrayList<>(
				Arrays.asList("Android","Angular","JSpring","Java8"));
		System.out.println(al);
		// How to loop through your collection
		// 1. index based - Find count
		System.out.println("1. Index based Process");
		int c = 0;
		for(int i=0; i< al.size();i++) {
			String s = al.get(i);
			if(s.startsWith("A"))
				c++;
			
		}
		System.out.println("Count startwith A = " + c);
		int nc = 0;
		// Count >20 in the LL
		for(int i=0;i<list.size();i++) {
			int n = list.get(i);
			if(n>20)
				nc++;
		}
		System.out.println("Count >20 = " + nc);
		c=0;
		// For Each, All collection implements Iterable
		System.out.println("2. For Each Process");
		for(String s:al) {
			if(s.startsWith("A"))
				c++;
		}
		System.out.println("Count startwith A = " + c);
		c = 0;
		System.out.println("3. Iterable and Iterator");
		Iterator<String> it1 = al.iterator(); // Step 1: get Iterator()
		while(it1.hasNext()) { // Boolean // 2. Loop through Iterator
			String s = it1.next(); // 3. Read the data by calling next()
			if(s.startsWith("A"))     // Perform the logic required
				c++;
		}
		System.out.println("Count startwith A = " + c);
		
		// Java 8 - Optional
		
		al.forEach(x->System.out.println(x));
			
		// Only Linked List can Iterator and ListIterator (Two Way)
		
		// Iteator()
		nc=0;
		Iterator<Integer> it2 = list.iterator();
		while(it2.hasNext()) {
			int d = it2.next();
			if(d>20)
				nc++;
		}
		System.out.println("Count >20 = " + nc);
		// ListIterator - Sum of the list values using ListIterator, end to start
		ListIterator<Integer> it3 = list.listIterator(list.size());// Iterator points the end
		System.out.println("Last Index = " + it3.previousIndex());
		int sum = 0;
		while(it3.hasPrevious()) {
			sum +=it3.previous();
		}
		System.out.println("Sum = " + sum);
		System.out.println(it3.previousIndex());// -1 in no previous
		
		it3 = list.listIterator();// Start at -1
		System.out.println("Start Index " + it3.previousIndex());
		System.out.println(it3.next());// Retreive the zero  for the first call of next
		// Using ListIterator object you can add, remove, modify
		it3.add(100); // after the zero position
		System.out.println(list);
		// 
		// Traverse from end to start
	/*	ListIterator<Integer> it = list.listIterator(list.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}*/

	}

}
