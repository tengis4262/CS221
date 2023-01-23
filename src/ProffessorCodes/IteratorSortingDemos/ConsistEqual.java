package ProffessorCodes.IteratorSortingDemos;

import java.util.Comparator;

public class ConsistEqual implements Comparator<EItem> {

	@Override
	public int compare(EItem o1, EItem o2) {
		if(o1.getBrand().compareTo(o2.getBrand())!=0) // Primary criteria by brand
		 return o1.getBrand().compareTo(o2.getBrand());
		else
			if(o1.getName().compareTo(o2.getName())!=0) // Secondary sort by name
			return 	(o1.getName().compareTo(o2.getName()));
			else
				return Double.compare(o1.getPrice(),o2.getPrice()); // Another secondary sort by price
	}

}
