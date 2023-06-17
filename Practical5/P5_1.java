public class P5_1
{
    public static void main(String[] args)
    {
        Shape shape = new Shape("red", true);

        Circle circle = new Circle(5.5, "blue", true);

        Rectangle rectangle = new Rectangle(20, 10, "yellow", true);

        Square square = new Square(25, "black", true);

        System.out.println(shape);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}

class Shape
{
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public Shape()
    {
        this("green", true);
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    @Override
    public String toString()
    {
        if (this.filled)
            return "A shape with color of " + this.color + " and filled.";
        else
            return "A Shape with color of " + this.color + " and NOT filled.";
    }
}

class Circle extends Shape
{
    private double radius;

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);

        this.radius = radius;
    }

    public Circle(double radius)
    {
        super();

        this.radius = radius;
    }

    public Circle()
    {
        this(1.0);
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape 
{
    private double width, length;

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);

        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle()
    {
        this(1, 1);
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return width * length;
    }

    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    @Override
    public String toString()
    {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle
{
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square()
    {
        this(1);
    }

    @Override
    public void setWidth(double width)
    {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length)
    {
        this.setWidth(length);
    }

    public double getSide()
    {
        return this.getWidth();
    }

    public void setSide(double side)
    {
        this.setWidth(side);
    }

    @Override
    public String toString()
    {
        return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
    }
}