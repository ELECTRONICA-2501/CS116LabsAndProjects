package CS116Lab1Bank;

public class BankAccount {
    private String accountID;
    private double balance;
    private String name;

    public BankAccount(){
        this.accountID = "0000";
        this.name = "unknown";
        this.balance = 0.0;
    }
    public BankAccount(String accountID, String name, double balance){
        this.accountID = accountID;
        this.balance = balance;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public double deposit(double amount){
        if (amount > 0.0){
            return amount += balance;
        } else {
            return balance;
        }
    }
    public double withdraw(double amount) {
        if (amount > 0.0 && amount <= balance) {
            return balance -= amount;
        } else {
            return balance;
        }
    }

    public String toString(){
        return "AccountID: " + accountID +
                "Name: " + name +
                "Account Balance: " + balance;
    }
}
