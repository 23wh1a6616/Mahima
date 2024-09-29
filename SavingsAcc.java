class SavingsAccount {
    // Static variable to store the annual interest rate for all account holders
    private static double annualInterestRate;
    // Instance variable to store the savings balance
    private double savingsBalance;

    // Constructor to initialize the savings balance
    public SavingsAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.savingsBalance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.savingsBalance = 0;
        }
    }

    // Method to calculate monthly interest and add it to the savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the interest rate
    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0) {
            annualInterestRate = newRate;
        } else {
            System.out.println("Interest rate cannot be negative.");
        }
    }

    // Method to get the current balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Set the annual interest rate
        SavingsAccount.modifyInterestRate(0.04); // 4% interest rate

        // Create a SavingsAccount object
        SavingsAccount account1 = new SavingsAccount(1000); // Initial balance of $1000

        // Calculate monthly interest
        account1.calculateMonthlyInterest();
        System.out.printf("New balance after interest: $%.2f%n", account1.getSavingsBalance());

        // Change the interest rate
        SavingsAccount.modifyInterestRate(0.05); // Change to 5%

        // Create another SavingsAccount object
        SavingsAccount account2 = new SavingsAccount(2000); // Initial balance of $2000
        account2.calculateMonthlyInterest();
        System.out.printf("New balance after interest: $%.2f%n", account2.getSavingsBalance());
    }
}

