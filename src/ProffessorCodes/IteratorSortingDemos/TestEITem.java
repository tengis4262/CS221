package ProffessorCodes.IteratorSortingDemos;

import java.util.*;

public class TestEITem {

	public static void main(String[] args) {
		// Sorting is always directly for the String and Wrapper type
		
		/*List<String> names = new ArrayList<>(
				Arrays.asList("Tim","Bennet","Kalkidan","Alem","Janet"));
		// To sort You have Collections
		System.out.println("Before sorting names");
		System.out.println(names);
		Collections.sort(names); // Sorting
		System.out.println("After Sorting");
		System.out.println(names);
		// Print Reversed order
		Collections.sort(names,Collections.reverseOrder());
		System.out.println("Reversed Sorting");
		System.out.println(names);*/
	
		// If you want to sort your Own class type like Student, Item etc.,
		// You have to implement Comparable or Comparator
		
		List<EItem>  list = new ArrayList<>();
		list.add(new EItem("Galaxy Se","Samasung",749.99));
		list.add(new EItem("UHD TV-60Inch","Sony",1769.99));
		list.add(new EItem("Tablet","Lenovo",555.99));
		list.add(new EItem("Laptop","Apple",849.99));
		list.add(new EItem("SD Card","Sony",249.99));
		System.out.println("Before Sorting");
		System.out.println(list);
		// 1. Need to sort by EItem namewise using Comparable
		Collections.sort(list); // You will a get error without Comparable for EItem class
		System.out.println(list);
		
		// You have compare by Brand using Comparator
		System.out.println("Sorted by Brand using Comparator");
		BrandSort ob = new BrandSort();
		Collections.sort(list,ob);

		Iterator<EItem> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Comparator using Anonymous
		
		System.out.println("Sort by price using Comparator");
		Collections.sort(list,new Comparator<EItem>() {

			@Override
			public int compare(EItem o1, EItem o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
			
		});
		for(EItem e: list) {
			System.out.println(e);
		}
	}

	 
}
