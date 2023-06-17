import java.util.Scanner;

public class P9_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Binary : " + convertToBinary(n));
    }

    public static String convertToBinary(int number) 
    {

        if (number == 0) 
        {
            return "0";
        } 
        else if (number == 1) 
        {
            return "1";
        }
        else {
            return convertToBinary(number / 2) + number % 2;
        }
    }
}