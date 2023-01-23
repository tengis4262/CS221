package ProffessorCodes.IteratorSortingDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestConsistEquals {

	public static void main(String[] args) {
		List<EItem>  list = new ArrayList<>();
		list.add(new EItem("Galaxy Se","Samasung",749.99));
		list.add(new EItem("UHD TV-60Inch","Sony",1769.99));
		list.add(new EItem("Tablet","Lenovo",555.99));
		list.add(new EItem("Laptop","Apple",849.99));
		list.add(new EItem("SD Card","Sony",249.99));
		list.add(new EItem("SD Card","Hp",269.99));
		list.add(new EItem("SD Card","Hp",100.99));
		
		
		EItem item1 = new EItem("SD Card","Hp",249.99);
		EItem item2 = new EItem("SD Card","Hp",249.99);
		EItem item3 = new EItem("SD Card","Hp",355.99);
		boolean res = item1.equals(item2);
		System.out.println("Items Equal ? " + res); // true
		
		/* equals comparison, will return true if name, brand and 
		 * price are same, so comparison of Item1 and Item3 return false
		 */
		res = item1.equals(item3); // false - Price is different
		System.out.println("Item1 and Item3 Equals ? " + res); // return false
		/* Brand Comparator, Item 2 and Item 3 has same brand but price is different
		// But Comparator return 0, means both brand names are equal which compared inside
		// BrandComparator */
		BrandSort ob = new BrandSort();
		
		int val = ob.compare(item1, item3);
		//int val = ob.compare(item1, item3);
		System.out.println("Item1 and Item3 brand equlas: " + val); // Return 0
		
		/* 1. If requirements wants to meet the criteria of 
		 * both equals and Comparator must check all the fields
		 * then Comparator must consist with equals.
		 * 
		 * 2. If you want primary and more secondary comparision
		 * like if Brands are same(Primary) compare by name(Secondary)
		 * If names are same compare by price.
		 * 
		 * Make use of all the fields used in equals must compare inside the 
		 * Comparator too.
		 * 
		 * The achieve the above two scenarios of concepts 
		 * you  have override equals and make comparator consists with equals() method
		 */
		Collections.sort(list,ob);
		for(EItem e:list) {
			System.out.println(e);
		}
		
		// Consist comparision
		ConsistEqual ob1 = new ConsistEqual();
		res = item1.equals(item3); // false - Price is different
		System.out.println("Item1 and Item3 Equals ? " + res); // false
		val = ob1.compare(item1, item3);
		System.out.println("Consist Compare : " + val);
		Collections.sort(list,ob1);
		for(EItem e:list) {
			System.out.println(e);
		}
		
		
	}

}
