package edu.wctc.eligrow;

public class Sale implements IPurchase {

    private double bill;

    public Sale(double bill) {
        this.bill = bill;
    }

    @Override
    public double getBillAmount() {
        return bill*0.1;
    }

    @Override
    public void setBillAmount(double d) {
        this.bill = d;
    }
}
