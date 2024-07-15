public class Customer {
private String name;
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public double getCashOnHand() {
    return cashOnHand;
}

public void setCashOnHand(double cashOnHand) {
    this.cashOnHand = cashOnHand;
}

public boolean isFinance() {
    return finance;
}

public void setFinance(boolean finance) {
    this.finance = finance;
}

private String address;
private double cashOnHand;
private boolean finance;

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
        emp.handleCustomer(this,finance,vehicle);
    }
}
