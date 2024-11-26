import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void removeTransaction(int index) {
        if (index >= 0 && index < transactions.size()) {
            transactions.remove(index);
        }
    }

    public void modifyTransaction(int index, Transaction transaction) {
        if (index >= 0 && index < transactions.size()) {
            transactions.set(index, transaction);
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getCurrentBalance() {
        double balance = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Income")) {
                balance += t.getAmount();
            } else if (t.getType().equalsIgnoreCase("Expense")) {
                balance -= t.getAmount();
            }
        }
        return balance;
    }

    // Method to load and save transactions to CSV...
}