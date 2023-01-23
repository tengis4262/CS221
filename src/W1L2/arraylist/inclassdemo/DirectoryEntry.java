package W1L2.arraylist.inclassdemo;

public class DirectoryEntry {
	private String name;
    private String number;
	public DirectoryEntry(String name, String number) {
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", number=" + number + "]\n";
	}
    
}
