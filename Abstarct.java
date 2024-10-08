abstract class Bank {
    public abstract double getBalance();
}

class BankA extends Bank {
    private double balance;

    public BankA() {
        this.balance = 100.0;
    }

  
    public double getBalance() {
        return balance;
    }
}


class BankB extends Bank {
    private double balance;

    public BankB() {
        this.balance = 150.0; 
    }


    public double getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private double balance;

    public BankC() {
        this.balance = 200.0; 
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
        
        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}
