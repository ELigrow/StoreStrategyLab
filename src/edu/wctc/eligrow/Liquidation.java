package edu.wctc.eligrow;

public class Liquidation implements IPurchase {

    private double bill;

    public Liquidation(double bill) {
        this.bill = bill;
    }

    @Override
    public double getBillAmount() {
        return bill*0.4;
    }

    @Override
    public void setBillAmount(double d) {
        this.bill = d;
    }
}
