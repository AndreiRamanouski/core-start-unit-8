package task45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private String name;
    private List<Branch> branches;

    public Bank(String name, List<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    public boolean addBranch(String branch) {
        boolean returnedValue = true;
        for (Branch b : branches) {
            if (b.getName().equals(branch)) {
                returnedValue = false;
            }
        }
        if (returnedValue) {
            returnedValue = branches.add(new Branch(branch, new ArrayList<Customer>()));
        }
        return returnedValue;
    }

    public boolean addCustomer(String nameOfBranch, String name, double initialTransaction) {
        boolean returnedValue = false;
        for (Branch branch : branches) {
            if (branch.getName().equals(nameOfBranch)) {
                if (branch.findCustomer(name) != null) {
                    branch.newCustomer(name, initialTransaction);
                    returnedValue = true;
                }
            }
        }
        return returnedValue;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String name, double initialTransaction) {
        boolean returnedValue = false;
        for (Branch branch : branches) {
            if (branch.getName().equals(nameOfBranch)) {
                returnedValue = branch.addCustomerTransaction(name, initialTransaction);
            }
        }
        return returnedValue;
    }

    public Branch findBranch(String name) {
        Branch returnedValue = null;
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                returnedValue = branch;
            }
        }
        return returnedValue;
    }

    public boolean listCustomers(String name, boolean printTransactions) {
        boolean returnedValue = false;
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                if (printTransactions) {
                    Arrays.toString(branch.getCustomers().toArray());
                    returnedValue = true;
                }
            }
        }
        return returnedValue;
    }
}
