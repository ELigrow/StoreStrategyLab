package edu.wctc.eligrow;

public class Customer {

    private String customerName;
    private IPurchase discountType;

    public Customer(String customerName, IPurchase discountType) {
        this.customerName = customerName;
        this.discountType = discountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount(){
        return discountType.getBillAmount();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", discountType=" + discountType +
                '}';
    }
}
