class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder = "Sudarsan Sridharan";
        b.accountNumber = "69402";
        b.balance = 204053;

        b.displayBalance();
        b.deposit(90000);
        b.withdraw(2000);
        b.withdraw(100000);  // Should fail
        b.displayBalance();
    }
}
