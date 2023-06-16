import java.util.Scanner;

public class P1_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        sc.close();

        if (n < 100 || n > 999)
        {
            System.out.println("Number must have only 3 digit.");
            return;
        }

        if (isPalindrome(n))
        {
            System.out.println(n + " is a Palindrome number.");
        }
        else
        {
            System.out.println(n + " is NOT a Palindrome number.");
        }

    }

    private static boolean isPalindrome(int n)
    {
        if (n / 100 == n % 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}