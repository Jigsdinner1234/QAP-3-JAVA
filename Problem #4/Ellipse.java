// Provide a minimal Shape base class so this file can compile standalone
// if the project-level Shape class is missing.
abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract void scale(double factor);
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

        // Ramanujan approximation
        return Math.PI * (3 * (a + b)
                - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}