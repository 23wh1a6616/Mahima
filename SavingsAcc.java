class SavingsAccount {

    private static double annualInterestRate;
   
    private double savingsBalance;

    public SavingsAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.savingsBalance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.savingsBalance = 0;
        }
    }

   
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }

  
    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0) {
            annualInterestRate = newRate;
        } else {
            System.out.println("Interest rate cannot be negative.");
        }
    }

 
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class Main {
    public static void main(String[] args) {
       
        SavingsAccount.modifyInterestRate(0.04); 

        
        SavingsAccount account1 = new SavingsAccount(1000); 

        
        account1.calculateMonthlyInterest();
        System.out.printf("New balance after interest: $%.2f%n", account1.getSavingsBalance());

     
        SavingsAccount.modifyInterestRate(0.05); 

        SavingsAccount account2 = new SavingsAccount(2000); 
        account2.calculateMonthlyInterest();
        System.out.printf("New balance after interest: $%.2f%n", account2.getSavingsBalance());
    }
}

