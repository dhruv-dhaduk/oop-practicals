import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class P8_3
{
    public static void main(String[] args)
    {
        File file = new File("Practical8_3.txt");
        
        PrintWriter out;

        try
        {
            out = new PrintWriter(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occured during accessing file.");
            return;
        }

        for (int i = 0; i < 100; i++)
        {
            int n = (int)(10000 * Math.random());
            out.print(n);
            out.print(" ");
        }

        out.flush();
        out.close();

        System.out.println("100 Random Numbers printed in file 'Practical8_3.txt'");

        Scanner sc;
        try
        {
            sc = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occured during accessing file.");
            return;
        }

        int[] list = new int[100];
        for (int i = 0; i < list.length; i++)
        {
            int n = sc.nextInt();
            list[i] = n;
        }

        sc.close();

        Arrays.sort(list);

        System.out.println("Sorted list of numbers generated : ");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
}