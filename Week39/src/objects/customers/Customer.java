package objects.customers;

public class Customer {
    public int id;
    private String name;
    private double balance;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.00;
    }

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = 0.00;
    }


    public String getName() {
        return this.name;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }


}
