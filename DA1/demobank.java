abstract class RBI {
    abstract void getInput();
    abstract void printDetails();
    abstract void calculateInterest();

    
    void commonBankProcess() {
        System.out.println("Common process across all banks.");
    }
}
class IndianBank extends RBI {
    private String accNo;
    private String accHolder;
    private double balance;
    private double interest;
    private static double roi;
    static {
        roi = 5.0; // 5% interest rate
    }
	
    void getInput() {
        accNo = "IND001";
        accHolder = "prakash";
        balance = 10000;
    }

    @Override
    void printDetails() {
        System.out.println("Indian Bank Account Details:");
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder Name: " + accHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + roi + "%");
        System.out.println("Interest: " + interest);
    }

    void calculateInterest() {
        interest = (balance * roi) / 100;
    }
}

class ICICI extends RBI {
    private String accNo;
    private String accHolder;
    private double balance;
    private double interest;
    private static double roi;
    static {
        roi = 6.0;
    }
    void getInput() {
        accNo = "ICI001";
        accHolder = "harish";
        balance = 20000;
    }

    void printDetails() {
        System.out.println("ICICI Bank Account Details:");
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder Name: " + accHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + roi + "%");
        System.out.println("Interest: " + interest);
    }

  
    void calculateInterest() {
        interest = (balance * roi) / 100;
    }
}

class CUB extends RBI {
    private String accNo;
    private String accHolder;
    private double balance;
    private double interest;
    private static double roi;
    static {
        roi = 7.0;
    }

    void getInput() {
        accNo = "CUB001";
        accHolder = "ravi";
        balance = 15000;
    }

    void printDetails() {
        System.out.println("CUB Bank Account Details:");
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder Name: " + accHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + roi + "%");
        System.out.println("Interest: " + interest);
    }
    void calculateInterest() {
        interest = (balance * roi) / 100;
    }
}

public class demobank {
    public static void main(String[] args) {
        RBI bank;
        bank = new IndianBank();
        bank.getInput();
        bank.calculateInterest();
        bank.printDetails();

        
        bank = new ICICI();
        bank.getInput();
        bank.calculateInterest();
        bank.printDetails();

        
        bank = new CUB();
        bank.getInput();
        bank.calculateInterest();
        bank.printDetails();
    }
}
