class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("Account no: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
    }
    void showBalance() {
        System.out.println("Balance: rs" + getBalance());
    }
}
class BankSystem {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.accountNumber = "09102829";
        account.accountHolder = "veeraraghavan";
        account.setBalance(190108289.85);

        account.display();
        account.showBalance();
    }
}
