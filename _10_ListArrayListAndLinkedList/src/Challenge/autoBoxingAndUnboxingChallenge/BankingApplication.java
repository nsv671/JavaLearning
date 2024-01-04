package Challenge.autoBoxingAndUnboxingChallenge;

import java.util.ArrayList;

public class BankingApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("nitesh", 671.00);
        System.out.println(customer);

        Bank bank = new Bank("SBI");
        bank.addNewCustomer("Bijay", 1000.0);
        System.out.println(bank);

        bank.addTransaction("Bijay", -500);
        bank.addTransaction("Bijay", -75);
        bank.printTransaction("Bijay");

        bank.addNewCustomer("nitesh", 10000);
        bank.addTransaction("nitesh", -5000);
        bank.addTransaction("nitesh", 1000);
        bank.addTransaction("nitesh", -250);
        System.out.println(bank);
    }
}

class Bank{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name=name;
    }

    public void addNewCustomer(String name, double intialDeposite){
        if(getCustomer(name) == null){
            Customer customer = new Customer(name, intialDeposite);
            customers.add(customer);
            System.out.println("New customer added : "+customer );
        }else{
            System.out.println("Customer -"+name+" already present");
        }
    }

    public void addTransaction(String name, double transaction){
        Customer customer = getCustomer(name);
        if(customer!=null) {
            customer.addTransaction(transaction);
            System.out.println(customer + " amount = " + transaction);
        }
    }

    public void printTransaction(String name){
        Customer customer = getCustomer(name);

        if(customer==null){
            return;
        }

        System.out.println("-".repeat(40));
        System.out.println("Customer name : "+name);
        System.out.println("Transactions : ");

        for(var transaction : customer.getTransactions()){
            System.out.printf("₹%10.2f - (%s) %n", transaction, transaction<0?"Debit":"Credit");
        }
    }

    private Customer getCustomer(String customerName){
        for(var customer : customers){
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }

        System.out.printf("Customer (%s) not found %n", customerName);
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}

class Customer{
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>(500);

    public Customer(String name, Double initialDeposite){
        this.name=name.toUpperCase();
        transactions.add(initialDeposite);
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
        System.out.println("Transaction added successfully, amount - "+transaction);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    //    @Override
//    public String toString(){
//        return "Customer name - "+name+ " initial deposit : "+ transactions.get(0);
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
