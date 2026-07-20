public class Demo {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 5);

        shapes[1] = new Circle("Ellipse", 8);

        shapes[2] = new EquilateralTriangle("Triangle", 6);

        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}

abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return name + " (radius=" + radius + ")";
    }
}

class EquilateralTriangle extends Shape {
    private final double side;

    public EquilateralTriangle(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public String toString() {
        return name + " (side=" + side + ")";
    }
}
