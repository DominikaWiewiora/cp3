public class BankAccountTest {
    

    public static void main(String[] args) {
    BankAccount  acc = new BankAccount();  
    
    acc.Deposit(500);
    System.out.println(acc.Display());
    acc.Deposit(200);
    System.out.println(acc.Display());
    acc.Withdraw(300);
    System.out.println(acc.Display());
    acc.Withdraw(600);
    System.out.println(acc.Display());
    }

}
