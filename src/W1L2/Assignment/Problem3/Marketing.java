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
    public String toString(){
        return "Employee Name :" + empName + " Product Name : " + productName +" Sale Amount : " +saleAmount;
    }

    public static void main(String[] args) {

//       ArrayListMarketing<Marketing> mar1 = new ArrayListMarketing();
//        ArrayListMarketing<Marketing> mar1 = new ArrayList();

//        mar1.add(new Marketing("Tengis","Pepsi", 4.99));
//        mar1.add(new Marketing("Uunuu","Cola", 3.99));
//        mar1.add(new Marketing("Ankhaa","Sprite", 2.99));
//        mar1.add(new Marketing("Daanaa","Fanta", 5.99));

    }
}
