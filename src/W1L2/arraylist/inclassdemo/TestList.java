package W1L2.arraylist.inclassdemo;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KWArrayListString l1 = new KWArrayListString();
		KWArrayListString l2 = new KWArrayListString(20);
		l1.add("Java");
		l1.add("C");
		l1.add("VC++");
		l1.add("Spring");
		l1.add("DS");
		l1.add("CS105");
		
		System.out.println(l1.size());
		System.out.println(l1);
		System.out.println(l1.get(0));
		//System.out.println(l1.get(2));
		System.out.println(l1.isEmpty());
		System.out.println(l1.indexOf("C"));
		System.out.println(l1.set(0, "JavaSpring"));
		System.out.println(l1.get(0));
		l1.add(1, "Swift");
		System.out.println(l1);
		System.out.println(l1.remove(3));
		System.out.println(l1);

	}

}
