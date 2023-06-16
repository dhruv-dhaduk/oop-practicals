import java.util.Scanner;

public class P2_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2 : ");
        String s2 = sc.nextLine();

        sc.close();

        String prefix = s1.substring(0,  commonPrefixIndex(s1, s2));

        System.out.println();
        System.out.println("Largest Common prefix of two Strings is : " + prefix);
    }

    private static int commonPrefixIndex(String s1, String s2)
    {
        int l = Math.min(s1.length(), s2.length());

        for (int i = 0; i < l; i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
            {
                return i;
            }
        }

        return l;
    }
}