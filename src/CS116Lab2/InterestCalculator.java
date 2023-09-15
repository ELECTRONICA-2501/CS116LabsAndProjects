package CS116Lab2;

public class InterestCalculator {
        public static double applyInterest(BankAccount a, int years, double interestRate) {
            // Calculate the final balance after applying interest for 'years' years
            for (int i = 0; i < years; i++) {
                double interest = a.getBalance() * (interestRate / 100);
                a.deposit(interest);
            }
            return a.getBalance();
        }

        public static void main(String[] args) {
            // Create a savings bank account for Alice with $110 balance
            BankAccount aliceAccount = new BankAccount("Alice", 110.0, false, true, 0.0);

            // Apply 5% interest for 8 years
            double finalBalance = applyInterest(aliceAccount, 8, 5.0);

            // Print the final account balance
            System.out.println("Final account balance for Alice: $" + finalBalance);
        }
    }
