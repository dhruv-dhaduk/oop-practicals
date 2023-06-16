public class P3_1 {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        r1.print();
        r2.print();
    }
}

class Rectangle
{
    public final double width;
    public final double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle()
    {
        this(1, 1);
    }

    public double getPerimeter()
    {
        return 2 * (this.width + this.height);
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public void print()
    {
        System.out.println("For Rectangle with width : " + this.width  + " and height : " + this.height + " ,");
        System.out.println("Perimeter : " + this.getPerimeter());
        System.out.println("Area : " + this.getArea());
        System.out.println();
    }
}