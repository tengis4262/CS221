package W1L1Assignment.Problem3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tengis", "Erdenebaatar","555-55-5555",
                new Address("1000 n 4th","Fairfield","IA","55526"),
                new Address("1000 n 4th","Fairfield","IA","55526"));
        Customer cust2 = new Customer("Nishesh", "Acharya","255-55-5335",
                new Address("1000 n 4th","Fairfield","IA","55526"),
                new Address("26 neri drive","Chicago","IL","60123"));
        Customer cust3 = new Customer("Zelalem", "Ambisa","532-15-5245",
                new Address("1000 n 4th","Fairfield","IA","55526"),
                new Address("233 e wacker drive","Chicago","IA","60124"));

        ArrayList<Customer> cust = new ArrayList<>(Arrays.asList(cust1,cust2,cust3));
        for (Customer cus: cust) {
            if(cus.getBillingAddress().city.equalsIgnoreCase("chicago"))
                System.out.println("Person who has Chicago as billing address: " + cus.getfName() + " " + cus.getlName());

        }




    }
}
