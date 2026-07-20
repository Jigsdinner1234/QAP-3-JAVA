public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }
}

// Minimal Triangle base class to satisfy compilation if original Triangle is missing.
// This is package-private and kept minimal to avoid changing other files.
class Triangle {
    protected String name;
    protected double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return a + b + c;
    }
}