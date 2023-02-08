package W3L5.Assignment;

import java.util.HashSet;

public class Problem1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("C++");
        set.add("Python");
        set.add("JavaScript");
        set.add("Angulus");

        HashSet<String> set1 = new HashSet<>();

        set1.add("OOP");
        set1.add("Cloud");
        set1.add("Python");
        set1.add("JavaScript");
        set1.add("Angulus");

        System.out.println("List of two sets before HashSet methods");
        System.out.println(set);
        System.out.println(set1);
        System.out.println("==============================");
        set.retainAll(set1);
        System.out.println("After using retainAll method ");
        System.out.println(set);
        System.out.println("==============================");
        set.addAll(set1);
        System.out.println("After using addAll method");
        System.out.println(set);
        System.out.println("==============================");
        System.out.println("Searching if set cointains Angulus using contains method: " + set.contains("Angulus"));
        System.out.println("==============================");
        System.out.println("Checking if set is empty: " + set.isEmpty());
        System.out.println("==============================");
        System.out.println("Set size : "  + set.size());
        System.out.println("==============================");
        set.removeAll(set);
        System.out.println("After removing everything from set");
        System.out.println(set);
        System.out.println("Checking if set is empty: " + set.isEmpty());


    }
}
