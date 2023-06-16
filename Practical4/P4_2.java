import java.util.Date;

public class P4_2
{
    public static void main(String[] args)
    {
        Account.setAnnualInterestRate(5);
        Account a = new Account(1, 100000);
        CheckingAccount ca = new CheckingAccount(2, 70000);
        SavingAccount sa = new SavingAccount(3, 500000);

        System.out.println(a);
        System.out.println(ca);
        System.out.println(sa);
    }
}

class Account
{
    private int id;
    private double balance;
    private final Date dateCreated;

    private static double annualInterestRate = 0;

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date(System.currentTimeMillis());
    }

    public Account()
    {
        this(0, 0);
    }

    public int getID()
    {
        return this.id;
    }
    public void setID(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public static void setAnnualInterestRate(double r)
    {
        annualInterestRate = r;
    }

    
    public static double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest()
    {
        return this.balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount)
    {
        this.balance = this.balance - amount;
    }

    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }

    @Override
    public String toString()
    {
        return "For Account #" + this.id + " ,\n"
            + "Balance : Rs. " + this.balance + "\n"
            + "Monthly Interest : Rs. " + this.getMonthlyInterest() + "\n"
            + "Account created on : " + this.dateCreated + "\n";
    }
}

class CheckingAccount extends Account
{
    private static double overDraftLimit;

    public CheckingAccount(int id, double balance)
    {
        super(id, balance);
    }

    public static double getOverDraftLimit()
    {
        return overDraftLimit;
    }

    public static void setOverDraftLimit(double l)
    {
        overDraftLimit = l;
    }

    @Override
    public void withdraw(double amount)
    {
        if (this.getBalance() - amount + overDraftLimit >= 0)
        {
            this.setBalance(this.getBalance() - amount);
        }
    }

    @Override
    public String toString()
    {
        return "For Checking Account #" + this.getID() + " ,\n"
            + "Balance : Rs. " + this.getBalance() + "\n"
            + "Monthly Interest : Rs. " + this.getMonthlyInterest() + "\n"
            + "Account created on : " + this.getDateCreated() + "\n";
    }
}

class SavingAccount extends Account
{
    public SavingAccount(int id, double balance)
    {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount)
    {
        if (this.getBalance() - amount >= 0)
        {
            this.setBalance(this.getBalance() - amount);
        }
    }

    @Override
    public String toString()
    {
        return "For Saving Account #" + this.getID() + " ,\n"
            + "Balance : Rs. " + this.getBalance() + "\n"
            + "Monthly Interest : Rs. " + this.getMonthlyInterest() + "\n"
            + "Account created on : " + this.getDateCreated() + "\n";
    }
}