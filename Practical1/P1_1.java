public class P1_1 
{
    public static void main(String[] args)
    {
        final float radius = 5.5f;

        double parimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("Parimeter of the circle having radius " + radius + " is : " + parimeter);
        System.out.println("Area of the circle having radius " + radius + " is : " + area);
    }
}