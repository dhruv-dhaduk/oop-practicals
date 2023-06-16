import java.util.Date;

public class P3_2
{
    public static void main(String[] args)
    {
        Account.setAnnualInterestRate(4.5);

        Account ac = new Account(1122, 20000);

        ac.print("Initially");

        ac.withdraw(2500);

        ac.print("After 2500 withdraw");

        ac.deposit(3000);

        ac.print("After 3000 deposit");
        
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

    public void print(String message)
    {
        System.out.println(message + ", For account #" + this.id + " ,");
        System.out.println("Balance :  Rs. " + this.balance);
        System.out.println("Monthly Interest : Rs. " + this.getMonthlyInterest());
        System.out.println("Account created on : " + dateCreated);
        System.out.println();
    }
}
