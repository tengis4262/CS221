package W1L1Assignment.Refreshing;

import java.util.Scanner;

public class CoinExchange {
    public static void main(String[] args) {
        double originalAmount;
        int dollars, quarters, dimes, nickels, pennies;
        Scanner ob = new Scanner(System.in);
        System.out.println("Please enter amount we will convert it to coin exchange");
        double amount = ob.nextDouble();
        originalAmount = amount;
        amount = amount*100;
        dollars = (int)(amount/100); // 1 dollars
        amount = amount%100;
        quarters =  (int)(amount/25); // quarters
        amount = amount%25;
        dimes = (int)(amount/10); // dimes
        amount = amount%10;
        nickels = (int)(amount/5); // nickels
        amount = amount%5;
        pennies = (int)(amount/1); // pennies
        System.out.println("Your Amount $"+ originalAmount + " consists of following " + "\n" +
                "Dollars: " + dollars + "\n" + "Quarters: " + quarters + "\n" + "Dimes: " + dimes + "\n" +
                "" + "Nickels: " + nickels + "\n" + "Pennies: " + pennies);

    }
}
