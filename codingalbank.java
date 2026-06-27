// Abstract Class
abstract class Bank {

    abstract void bankService();

    void bankName() {
        System.out.println("Welcome to Codingal Bank");
    }
}

// Savings Account
class SavingsAccount extends Bank {

    void bankService() {
        System.out.println("Savings Account Service");
        System.out.println("Interest Rate: 5% per year");
    }
}

// Current Account
class CurrentAccount extends Bank {

    void bankService() {
        System.out.println("Current Account Service");
        System.out.println("No interest is provided.");
    }
}

// Loan Service
class LoanService extends Bank {

    void bankService() {
        System.out.println("Loan Service");
        System.out.println("Education and Home Loans Available.");
    }
}

// Main Class
public class codingalbank {

    public static void main(String[] args) {

        Bank b;

        b = new SavingsAccount();
        b.bankName();
        b.bankService();

        System.out.println();

        b = new CurrentAccount();
        b.bankName();
        b.bankService();

        System.out.println();

        b = new LoanService();
        b.bankName();
        b.bankService();
    }
}