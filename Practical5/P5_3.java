import java.util.Scanner;

public class P5_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double r1, r2;

        System.out.print("Enter radius for both circles : ");
        r1 = sc.nextDouble();
        r2 = sc.nextDouble();

        sc.close();

        ComparableCircle c1 = new ComparableCircle(r1);
        ComparableCircle c2 = new ComparableCircle(r2);

        int cmp = c1.compareTo(c2);

        if (cmp > 0)
        {
            System.out.println("Circle1 > Circle2");
        }
        else if (cmp < 0)
        {
            System.out.println("Circle1 < Circle2");
        }
        else
        {
            System.out.println("Circle1 = Circle2");
        }
    }
}

class Circle
{
    private final double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle()
    {
        this(1);
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
    ComparableCircle(double radius)
    {
        super(radius);
    }

    ComparableCircle()
    {
        super();
    }

    @Override
    public int compareTo(ComparableCircle c) {
        double a1 = this.getArea();
        double a2 = c.getArea();

        return a1 > a2 ? 1 : a1 < a2 ? -1 : 0;
    }
}