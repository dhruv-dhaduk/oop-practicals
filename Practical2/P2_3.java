import java.util.Scanner;

public class P2_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        sc.close();

        if (isValid(password))
            System.out.println("Password is Valid.");
        else 
            System.out.println("password is NOT Valid.");
    }

    private static boolean isValid(String password)
    {
        if (password.length() < 8) 
            return false;

        int digits = 0;
        for (int i = 0; i < password.length(); i++)
        {
            char c = password.charAt(i);

            if (Character.isDigit(c))
                digits++;
            else if (Character.isAlphabetic(c))
                continue;
            else
                return false;
        }

        if (digits >= 2)
            return true;
        return false;
    }
}