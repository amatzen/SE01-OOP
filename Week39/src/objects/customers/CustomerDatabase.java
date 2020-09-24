package objects.customers;

import com.google.gson.Gson;

public class CustomerDatabase {
    Customer[] customers;

    public CustomerDatabase () {
        this.customers = new Customer[10];
    }

    public void addCustomer (Customer c) {
        int a = 0;

        while(this.customers[a] != null) {
            a++;
        }

        this.customers[a] = c;
    }

    public void deleteCustomer (int customerId) {
        for (int i = 0; i < customers.length; i++) {
            if( this.customers[i] != null && this.customers[i].id == customerId ) {
                this.customers[i] = null;
            }
        }
    }

    public String getCustomers () {
        Gson gson = new Gson();
        return gson.toJson(this.customers);
    }

    public String getCustomerNames () {
        String customerNames = "";

        for (Customer c: this.customers) {
            if(c != null) customerNames += c.getName() + "\n";
        }

        return customerNames;
    }

}
