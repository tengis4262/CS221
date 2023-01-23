package ProffessorCodes.IteratorSortingDemos;

public class EItem implements Comparable<EItem>{ // Generic type, EItem
	private String name;
	private String brand;
	private double price;
	public EItem(String name, String brand, Double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "EItem [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public int compareTo(EItem o) {
		// Pricewise
	/*	if(this.price>o.price)
			return 1;
		else
			if (this.price<o.price)
				return -1;
				else
					return 0;*/
	//return Double.compare(this.price,o.price);	
	// Reversed Pricewise 
		return Double.compare(o.price,this.price);	
		
	// 	return this.name.compareTo(o.name); // Namewise sort
	}
	@Override
	public boolean equals(Object ob) {
		if (this == ob)
			return true; // Same Object?
		if (ob == null)
			return false; // Null Object?

		if (this.getClass() == ob.getClass()) {
			EItem item = (EItem)ob;
			if(this.brand.equals(item.brand)&&
			   this.name.equals(item.name)&&
			   this.price==item.price)
				return true;			
		}
		return false;
	}
	
}
