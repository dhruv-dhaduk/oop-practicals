public class P7_1
{
    public static void main(String[] args)
    {
        int threads = 20;

        int times = 3;
        
        String message = "Hello World!";

        Printer printers[] = new Printer[threads];

        for (int i = 0; i < threads; i++)
        {
            printers[i] = new Printer(message, times);
        }

        for (int i = 0; i < threads; i++)
        {
            printers[i].start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                continue;
            }
        }
    }
}

class Printer extends Thread
{
    private static int totalThreads = 0;

    private final int id;
    private final String message;
    private final int times;

    Printer(String message, int times)
    {
        this.id = totalThreads;
        totalThreads++;

        this.message = message;
        this.times = times;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println("Thread #" + this.id + "(" + (i+1) + ") : " + this.message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                continue;
            }
        }
    }
}