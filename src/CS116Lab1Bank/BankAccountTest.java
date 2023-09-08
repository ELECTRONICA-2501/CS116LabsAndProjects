package CS116Lab1Bank;

public class BankAccountTest {
    public static void main(String[] args) {

                // Create a BankAccount object with default values
                BankAccount account1 = new BankAccount();
                System.out.println("Account 1 Details: ");
                System.out.println("Name: " + account1.getName());
                System.out.println("Balance: $" + account1.getBalance());
                System.out.println();

                // Create a BankAccount object with specific values
                BankAccount account2 = new BankAccount("12345", "Johnny Law ", 1000.0);
                System.out.println("Account 2 Details: ");
                System.out.println("Name: " + account2.getName());
                System.out.println("Balance: $" + account2.getBalance());
                System.out.println();

                // Deposit and withdraw from account2
                double depositAmount = 500.0;
                double withdrawAmount = 300.0;

                System.out.println("Depositing $ " + depositAmount + " into Account 2");
                account2.deposit(depositAmount);
                System.out.println("New Balance: $ " + account2.getBalance());

                System.out.println("Withdrawing $ " + withdrawAmount + " from Account 2");
                account2.withdraw(withdrawAmount);
                System.out.println("New Balance: $ " + account2.getBalance());
                System.out.println();

                // Display updated account2 details
                System.out.println("Updated Account 2 Details:");
                System.out.println("Name: " + account2.getName());
                System.out.println("Balance: $" + account2.getBalance());
                System.out.println();

                // Test toString method
                System.out.println("Account 1 Details (toString method):");
                System.out.println(account1.toString());
                System.out.println();

                System.out.println("Account 2 Details (toString method):");
                System.out.println(account2.toString());
            }
        }


