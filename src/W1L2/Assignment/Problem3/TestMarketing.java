package W1L2.Assignment.Problem3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMarketing {
    public static void main(String[] args) {

        Marketing mar1 = new Marketing("Tengis", "Apple", 999.50);
        Marketing mar2 = new Marketing("Anhaa", "Samsung", 248.99);
        Marketing mar3 = new Marketing("Uunuu", "Google", 499.99);

        ArrayList<Marketing> mar = new ArrayList<>();

        mar.add(mar1);
        mar.add(mar2);
        mar.add(mar3);
        totalSales(mar);
        System.out.println();
        mar.remove(mar2);
        System.out.println(mar);
        mar.set(0, mar3);
        System.out.println(mar.get(0));
        System.out.println(mar.size());
        mar.clear();

    }

    public static void totalSales(ArrayList<Marketing> list){
        double sum=0;
        for(Marketing marketing : list){
            sum+=marketing.getSalesAmount();
        }
        System.out.println("TotalAmount: "+sum);
    }
}