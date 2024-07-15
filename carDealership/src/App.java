public class App {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 somewhere st.");
        cust1.setCashOnHand(12000);
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Honda");
        vehicle.setModel("Accord");
        vehicle.setPrice(100000);

        Employee emp = new Employee();
        cust1.purchaseCar(vehicle, emp, false);
        cust1.toString();

    }
}
