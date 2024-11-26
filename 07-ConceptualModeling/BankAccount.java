public class BankAccount {
    private int balance;
    private String accountOwner;
    private int accountNumber;
    private String[] recentTransactions = new String[3];
    private int transactionIndex = 0;

    
    public int displayBalance() {
        return balance;
    }

    
    private void addTransaction(String transaction) {
        recentTransactions[transactionIndex] = transaction;
        transactionIndex = (transactionIndex + 1) % 3; 
    }

   
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        addTransaction("Deposited: PLN " + amount);
    }

   
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (amount > 500) {
            System.out.println("CANNOT WITHDRAW MORE THAN PLN 500 AT A TIME.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            addTransaction("Withdrew: PLN " + amount);
        } else {
            System.out.println("WITHDRAWAL NOT POSSIBLE: INSUFFICIENT FUNDS.");
        }
    }

    
    public void displayRecentTransactions() {
        System.out.println("Recent Transactions:");
        for (String transaction : recentTransactions) {
            if (transaction != null) { 
                System.out.println(transaction);
            }
        }
    }
}
