abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();
}

public class Ellipse extends Shape {

    protected double a;
    protected double b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);

        if (axis1 >= axis2) {
            a = axis1;
            b = axis2;
        } else {
            a = axis2;
            b = axis1;
        }
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        // Ramanujan Approximation
        return Math.PI * (3 * (a + b) -
                Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}