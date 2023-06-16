import java.util.Scanner;

public class P1_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinates x and y : ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (inTriangle(x, y))
        {
            System.out.println(x + " & " + y + " are in the triangle");
        }
        else
        {
            System.out.println(x + " & " + y + " are NOT in the triangle");
        }

        sc.close();
    }

    private static boolean inTriangle(float x, float y)
    {
        // Make sure point is in 1st Quadrant
        if (x <= 0 || y <= 0)
        {
            return false;
        }

        // Equation of line passing through (200, 0) and (0, 100) is x + 2y = 200
        if (x + 2 * y < 200)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}