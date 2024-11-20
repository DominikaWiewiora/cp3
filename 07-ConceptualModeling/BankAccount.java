public class BankAccount {
    private int balance;
    private String account_owner;
    private int account_number;



    public int Display() {
        return balance;
    }

    public void Deposit(int n) {
        balance+=n;
    }

    public void Withdraw(int n) {
        if (balance >= n) {
            balance-=n;
        }
        else {
            System.out.println("WITHDRAW NOT POSSIBLE");
        }
        if (n>500) {
            System.out.println("CANNOT WITHDRAW MORE THAN 500 AT TIME");
        }

    }


}