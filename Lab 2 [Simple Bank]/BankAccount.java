public abstract class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("New Balance: " + this.balance);
    }
    public abstract void withdraw(double amount);
    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}