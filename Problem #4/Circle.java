public class Circle extends Ellipse {

    public Circle(String name, double radius) {
        super(name, radius, radius);
    }
}

// Minimal package-private Ellipse implementation to resolve missing type.
class Ellipse {
    protected String name;
    protected double a;
    protected double b;

    public Ellipse(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public String toString() {
        return name + "(a=" + a + ", b=" + b + ")";
    }
}