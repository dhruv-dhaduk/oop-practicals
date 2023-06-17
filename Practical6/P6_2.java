import java.util.InputMismatchException;
import java.util.Scanner;

public class P6_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b;

        while (true)
        {
            try
            {
                System.out.print("Enter a : ");
                a = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter b : ");
                b = sc.nextInt();
                sc.nextLine();
            }
            catch(InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Input Mismatch");
                System.out.println();
                continue;
            }
            break;
        }
        
        sc.close();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}