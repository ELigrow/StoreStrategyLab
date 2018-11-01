package edu.wctc.eligrow;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> orders = new ArrayList<>();
        //Discount types S for Sale, D for Discount, L for Liquidation
        orders.add(new Customer("William Walters", new Discount(19.99)));
        orders.add(new Customer("Susan Smothers", new Sale(25.99)));
        orders.add(new Customer("Jessica Johnson", new Liquidation(199)));
        orders.add(new Customer("Richard Ricardo", new Discount(41657.65)));

        double total=0;
        for(Customer o: orders) {
            System.out.println(o.getCustomerName() + " " + o.getBillAmount());
            total+= o.getBillAmount();
        }
        System.out.println("Total:    " + total);

    }
}
