class BankAccount {
    static String bankName = "hdfc";
    static int totalAccounts = 0;
    final String accountNumber;
    String accountHolderName;
    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Accountno: " + accountNumber);
            System.out.println("BankName: " + bankName);
        }
    }
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Sudarsan", "001");
        BankAccount a2 = new BankAccount("Vishal", "002");
        a1.displayDetails();
        a2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
