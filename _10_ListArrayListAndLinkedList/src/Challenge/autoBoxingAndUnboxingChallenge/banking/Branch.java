package Challenge.autoBoxingAndUnboxingChallenge.banking;

import java.util.ArrayList;

public class Branch {
    // write code here
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        customers = new ArrayList<>(5000);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String name, double intitalTransaction){
        Customer customer = findCustomer(name);

        if(customer==null){
            customers.add(new Customer(name, intitalTransaction));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name){
        for(var customer : customers){
            if(customer.getName().equals(name)){
                return customer;
            }
        }

        return null;
    }
}