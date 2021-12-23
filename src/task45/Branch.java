package task45;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private List<Customer> customers;

    public Branch(String name, List<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction) {
        boolean returnedValue = false;
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                returnedValue = true;
            }
        }
        if (!returnedValue) {
            returnedValue = customers.add(new Customer(name, List.of(transaction)));
        }
        return returnedValue;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        boolean returnedValue = false;
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                customer.addTransaction(transaction);
                returnedValue = true;
            }
        }
        return returnedValue;
    }

    public Customer findCustomer(String name){
        Customer returnedValue = null;
        for (Customer c : customers){
            if(c.getName().equals(name)){
                returnedValue = c;
            }
        }
        return returnedValue;
    }
}
