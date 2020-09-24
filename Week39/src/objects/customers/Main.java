package objects.customers;

public class Main {
    public static void main(String[] args) {

        // Opgave 10.1

        Customer aCustomer = new Customer(1, "Jørgen Jensen");

        aCustomer.deposit(400);

        aCustomer.withdraw(320);

        System.out.println(aCustomer.getBalance());

        // Opgave 10.2

        CustomerDatabase db = new CustomerDatabase();

        db.addCustomer(aCustomer);
        db.addCustomer(new Customer(2, "Jens Jørgensen", 4.80));
        db.addCustomer(new Customer(3, "Hans Christian Andersen", 92.4));


        System.out.println(db.getCustomers());
        System.out.println(db.getCustomerNames());

        db.deleteCustomer(2);

        System.out.println(db.getCustomers());
        System.out.println(db.getCustomerNames());


    }
}
