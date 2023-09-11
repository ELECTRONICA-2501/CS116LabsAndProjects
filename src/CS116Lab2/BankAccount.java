package CS116Lab2;

public class BankAccount {
    //private String accountID;
    private double balance;
    private String name;
    private boolean isChecking;
    private boolean isSaving;
    private double overdrawLimit;


        public BankAccount(){
        //    this.accountID = "0000";
            this.name = "unknown";
            this.balance = 0.0;
            this.overdrawLimit = -30.0;
        }


    public BankAccount(String name, double balance,
                       boolean isChecking,
                       boolean isSaving,
                       double overdrawLimit) {
        //default constructor
        //    this.accountID = accountID;
        this.balance = balance;
        this.name = name;
        this.isChecking = isChecking;
        this.isSaving = isSaving;
        this.overdrawLimit = overdrawLimit;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public boolean isChecking(){
        return isChecking;
    }
    public boolean isSaving(){
        return isSaving;
    }

    public double deposit(double amount) {
        if (amount > 0.0) {
            return amount += balance;
        } else {
            return balance;
        }
    }

    public double withdraw(double amount) {
        //if (amount > 0.0 && amount <= balance) {
        if (amount > 0) {
            double newBalance = balance - amount;
            if ((isChecking && newBalance >= -overdrawLimit) || (isSaving && newBalance >= 0)) {
                return balance -= amount;
            } else {
                System.out.println("withdrawal exceeds overdraw limit");
            }
        } else {
            System.out.println("invalid amount request");
        }
        return amount;
    }

    public void setOverdrawLimit(double overdrawLimit){
        if (overdrawLimit >= 0) {
            this.overdrawLimit = overdrawLimit;
            //set logic
            System.out.println("Overdraw = $ " + overdrawLimit);
        }else{
            System.out.println("Invalid Limit");
        }
    }
}


