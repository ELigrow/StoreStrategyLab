package edu.wctc.eligrow;

public class Discount implements IPurchase {

    private double bill;

    public Discount(double bill) {
        this.bill = bill;
    }

    @Override
    public double getBillAmount() {
        return bill*0.2;
    }

    @Override
    public void setBillAmount(double d) {
        this.bill = d;
    }
}
