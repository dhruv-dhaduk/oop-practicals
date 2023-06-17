public class P5_2
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(20, 10, "black");
        Triangle t = new Triangle(20, 10, "yellow");

        System.out.println(r);
        System.out.println(t);
    }
}

abstract class Shape
{
    private String color;

    Shape(String color)
    {
        this.color = color;
    }

    Shape()
    {
        this("red");
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    abstract public double getArea();

    @Override
    abstract public String toString();
}

class Rectangle extends Shape
{
    private int length;
    private int height;

    Rectangle(int length, int height, String color)
    {
        super(color);
        this.length = length;
        this.height = height;
    }

    Rectangle(int length, int height)
    {
        super();
        this.length = length;
        this.height = height;
    }

    Rectangle()
    {
        this(1, 1);
    }

    public int getLength()
    {
        return this.length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return (double) length * height;
    }

    @Override
    public String toString()
    {
        return "Rectangle of length=" + getLength() + " and height=" + getHeight() + ", Area=" + getArea() + " and Color=" + getColor();
    }
}

class Triangle extends Shape
{
    private int base;
    private int height;

    Triangle(int base, int height, String color)
    {
        super(color);
        this.base = base;
        this.height = height;
    }

    Triangle(int base, int height)
    {
        super();
        this.base = base;
        this.height = height;
    }

    Triangle()
    {
        this(1, 1);
    }

    public int getBase()
    {
        return this.base;
    }

    public void setBase(int base)
    {
        this.base = base;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return (double) base * height / 2;
    }

    @Override
    public String toString()
    {
        return "Triangle of base=" + getBase() + " and height=" + getHeight() + ", Area=" + getArea() + " and Color=" + getColor();
    }
}