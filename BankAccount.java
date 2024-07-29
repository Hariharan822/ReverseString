public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        }
        else {
            System.out.println("The deposit amount is invalid");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : "+ amount);
        }
        else {
            System.out.println("The withdraw amount in invalid");
        }
    }
     public void displayBalance() {
        System.out.println("AccountNumber : " + accountNumber);
        System.out.println("Balance : "+ balance);
     }
}

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void setInterestRate() {
        double interest = balance * (interestRate / 100);
        balance += interestRate;
        System.out.println("Added interest : "+ interest);
    }
}
