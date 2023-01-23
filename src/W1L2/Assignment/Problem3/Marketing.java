package W1L2.Assignment.Problem3;

import java.util.ArrayList;

public class Marketing {
    private String empName,productName;
    private double saleAmount;

    public Marketing(String empName, String productName, double saleAmount) {
        this.empName = empName;
        this.productName = productName;
        this.saleAmount = saleAmount;

    }

    public static void main(String[] args) {
        ArrayList<Marketing> mar = new ArrayList<>();

      //  ArrayListMarketing<Marketing> mar1 = new ArrayListMarketing();

        mar.add(new Marketing("Tengis","Pepsi", 4.99));
        mar.add(new Marketing("Uunuu","Cola", 3.99));
        mar.add(new Marketing("Ankhaa","Sprite", 2.99));
        mar.add(new Marketing("Daanaa","Fanta", 5.99));

    }
}
