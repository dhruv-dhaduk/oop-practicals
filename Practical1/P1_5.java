import java.util.Scanner;

public class P1_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float x1, y1, x2, y2;

        System.out.print("Enter point 1 (latitude and longitude) in degrees : ");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        System.out.print("Enter point 2 (latitude and longitude) in degrees : ");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();

        sc.close();

        double distance = circleDistance(x1, y1, x2, y2);

        System.out.println("Ths distance between the two points is " + distance + " km");
    }

    private static double circleDistance(float x1, float y1, float x2, float y2)
    {
        double redx1 = Math.toRadians(x1);
        double redy1 = Math.toRadians(y1);
        double redx2 = Math.toRadians(x2);
        double redy2 = Math.toRadians(y2);

        double r = 6371.01;

        return r * Math.acos(Math.sin(redx1) * Math.sin(redx2) + Math.cos(redx1) * Math.cos(redx2) * Math.cos(redy1 - redy2));
    }
}