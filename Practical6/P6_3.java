import java.util.Scanner;

public class P6_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter triangle sides a, b, c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        sc.close();

        Triangle t;

        try
        {
            t = new Triangle(a, b, c);
        }
        catch(IllegalTriangleException e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("Triangle is Valid.");
    }
}

class Triangle
{
    private final int a, b, c;

    Triangle(int a, int b, int c) throws IllegalTriangleException
    {
        if (a + b <= c || b + c <= a || a + c <= b)
            throw new IllegalTriangleException("Illegal Sides for Triangle");

        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class IllegalTriangleException extends IllegalArgumentException {
    IllegalTriangleException(String message)
    {
        super(message);
    }
}