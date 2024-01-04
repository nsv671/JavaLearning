package Challenge.autoBoxingAndUnboxingChallenge.banking;

import java.util.ArrayList;

public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>(500);
    }

    public boolean addBranch(String name){
        Branch branch = findBranch(name);
        if(branch == null){
            branches.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);

        if(branch !=null){
            return branch.newCustomer(customerName, initialTransaction);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName); //.class.getDeclaredMethod("private_Method")

        if(branch !=null){
            return branch.addCustomerTransaction(customerName, transaction);
        }

        return false;
    }

    private Branch findBranch(String name){
        for(var branch : branches){
            if(branch.getName().equalsIgnoreCase(name)){
                return branch;
            }
        }

        return null;
    }

    public boolean listCustomers(String name, boolean printTransaction){
        Branch branch = findBranch(name);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList < Customer > branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (printTransaction) {
                    System.out.println("Transactions");
                    ArrayList < Double > transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }

        return false;
    }

}