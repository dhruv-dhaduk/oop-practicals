import java.util.Scanner;

public class P7_3
{
    public static void main(String[] args)
    {
        Int n = new Int(0);

        boolean syn = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Use Synchronize ? (y/n) : ");
        char c = sc.nextLine().toLowerCase().charAt(0);
        sc.close();
        if (c == 'y')
            syn = true;

        System.out.println("Initial value of n : " + n);

        Adder[] threads = new Adder[10];

        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new Adder(n, syn);
        }

        for (int i = 0; i < threads.length; i++)
        {
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++)
        {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                continue;
            }
        }

        System.out.println("Final value of n : " + n);
        System.out.println("(Synchronization : " + syn + ")");
    }
}

class Adder extends Thread
{
    private final Int n;
    private final boolean syn;

    Adder(Int n, boolean syn)
    {
        this.n = n;
        this.syn = syn;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        };
        if (syn)
            n.incrementSyn();
        else
            n.increment();
    }
}

class Int
{
    private int value;

    public Int(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    public void increment()
    {
        this.value++;
    }

    synchronized public void incrementSyn()
    {
        this.value++;
    }

    @Override
    public String toString()
    {
        return "" + this.getValue();
    }
}