package task45;

import java.util.List;

public class Customer {
    private String name;
    private List<Double> transactions;

    public Customer(String name, List<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(Double transactionToAdd){
        transactions.add(transactionToAdd);
    }
}
