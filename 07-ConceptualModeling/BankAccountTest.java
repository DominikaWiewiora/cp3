public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: PLN " + acc.displayBalance());
        acc.deposit(200);
        System.out.println("Balance: PLN " + acc.displayBalance());
        acc.withdraw(300);
        System.out.println("Balance: PLN " + acc.displayBalance());
        acc.withdraw(600);
        System.out.println("Balance: PLN " + acc.displayBalance());
        acc.withdraw(700);
        acc.displayRecentTransactions();
    }
}
