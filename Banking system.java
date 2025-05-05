import java.util.ArrayList;
import java.util.List;

// Account Interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}

// SavingsAccount class
class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.04; // 4% annual interest

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in Savings Account");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void viewBalance() {
        System.out.println("Savings Account Balance: ₹" + balance);
    }

    // Unique method
    public void addAnnualInterest() {
        balance += calculateInterest();
        System.out.println("Annual interest added to Savings Account");
    }
}

// CurrentAccount class
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit = 5000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in Current Account");
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Current Account");
        } else {
            System.out.println("Overdraft limit exceeded in Current Account");
        }
    }

    public double calculateInterest() {
        return 0; // No interest for current account
    }

    public void viewBalance() {
        System.out.println("Current Account Balance: ₹" + balance);
    }

    // Unique method
    public void checkOverdraft() {
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}

// Bank class
class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account added to bank.");
    }

    public void showAllBalances() {
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}

// Main class to test
public class BankingSystemDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        savings.deposit(10000);
        savings.addAnnualInterest();
        savings.viewBalance();

        current.deposit(5000);
        current.withdraw(7000);
        current.checkOverdraft();
        current.viewBalance();

        bank.addAccount(savings);
        bank.addAccount(current);

        System.out.println("\n--- All Account Balances ---");
        bank.showAllBalances();
    }
}
