package Challenge.autoBoxingAndUnboxingChallenge.banking;

import java.util.ArrayList;

public class Customer {
    // write code here
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>(50000);

    public Customer(String name, double initialTransaction){
        this.name=name;
        transactions.add(initialTransaction);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}