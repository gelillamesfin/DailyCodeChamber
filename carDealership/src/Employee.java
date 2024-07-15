public class Employee {

    public void handleCustomer(Customer cust, boolean finance,Vehicle vehicle){
        if(finance){
            double loanAmount=vehicle.getPrice()-cust.getCashOnHand();
            runCreditHistory(cust,loanAmount);
        }else if(vehicle.getPrice()<=cust.getCashOnHand()){
            processesTransaction(cust,vehicle);
        }else{
            System.out.println("customer needs more money to purchase the vehicle");
        }
    }

    public void runCreditHistory(Customer cust, double loanAmount){
System.out.println("Ran credit hisotry for customer...");
System.out.println("Customer approved to purchase the vehicle");
    }
    public void processesTransaction(Customer cust ,Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle "+ vehicle + "for the price "+ vehicle.getPrice());
    }
}
