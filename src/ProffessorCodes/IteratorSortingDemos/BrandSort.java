package ProffessorCodes.IteratorSortingDemos;

import java.util.Comparator;

public class BrandSort implements Comparator<EItem> {
	@Override
	public int compare(EItem o1, EItem o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
