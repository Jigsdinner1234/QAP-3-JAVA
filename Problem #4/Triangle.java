abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double perimeter();
    public abstract double area();
    public abstract void scale(double factor);
}

public class Triangle extends Shape {

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String name, double s1, double s2, double s3) {

        super(name);

        if (s1 <= 0 || s2 <= 0 || s3 <= 0 ||
                s1 + s2 <= s3 ||
                s2 + s3 <= s1 ||
                s3 + s1 <= s2) {

            System.out.println("Error: Invalid Triangle.");
            System.exit(0);
        }

        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {

        double s = perimeter() / 2.0;

        return Math.sqrt(
                s *
                (s - side1) *
                (s - side2) *
                (s - side3));
    }

    @Override
    public void scale(double factor) {

        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}