package CS116Lab2;

public class BankAccountTest {
    public static void main(String[] args) {
        // Create a savings account for Alice with a $50.0 withdrawal limit and $100.0 initial balance
        BankAccount aliceAccount = new BankAccount("Alice", 100.0, false, true, 50.0);

        // Create a checking account for Bob with a $30.0 withdrawal limit and $350.0 initial balance
        BankAccount bobAccount = new BankAccount("Bob", 350.0, true, false, 30.0);

        // Execute the specified operations and print their return values
        double leftoverWithdraw = bobAccount.withdraw(200.0);
        System.out.println("Withdraw from Bob's account: $" + leftoverWithdraw);

        double depositResult = aliceAccount.deposit(50.0);
        System.out.println("Deposit into Alice's account: $" + depositResult);

        leftoverWithdraw = bobAccount.withdraw(1000.0);
        System.out.println("Withdraw from Bob's account: $" + leftoverWithdraw);

        boolean transferResult = bobAccount.transfer(aliceAccount, 75.0);
        System.out.println("Transfer from Bob to Alice: " + (transferResult ? "Successful" : "Failed"));

        // Print account information for Bob and Alice
        System.out.println("\nAccount Information:");
        System.out.println("Bob's Account: " + bobAccount.toString());
        System.out.println("Alice's Account: " + aliceAccount.toString());
    }
}
