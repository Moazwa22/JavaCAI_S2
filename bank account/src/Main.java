public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(2000.0);

        System.out.println("Balance: " + account.getBalance());

        account.deposit(1500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(3000.0);
        System.out.println("Balance after withdraw: " + account.getBalance());
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("You entered wrong data");
        } else {
            balance += amount;
            System.out.println("deposit : " + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Wrong withdraw");
        }
    }
}