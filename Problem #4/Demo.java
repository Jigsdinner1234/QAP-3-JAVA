interface Shape {
    void scale(double factor);
}

public class Demo {

    // Static method required by the assignment
    static void scaleShapes(Shape[] shapes, double factor) {

        for (Shape s : shapes) {
            s.scale(factor);
        }
    }

    public static void main(String[] args) {

        Shape[] shapes = {
                (Shape) new Circle("Circle", 5),
                (Shape) new Ellipse("Ellipse", 8, 5),
                (Shape) new Triangle("Triangle", 3, 4, 5),
                (Shape) new EquilateralTriangle("Equilateral Triangle", 6)
        };

        System.out.println("===== BEFORE SCALING =====");

        for (Shape s : shapes) {
            System.out.println(s);
        }

        scaleShapes(shapes, 2);

        System.out.println("===== AFTER SCALING =====");

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}

class Circle implements Shape {
    private final String name;
    private double radius;

    Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        return name + " (radius=" + radius + ")";
    }
}

class Ellipse implements Shape {
    private final String name;
    private double majorAxis;
    private double minorAxis;

    Ellipse(String name, double majorAxis, double minorAxis) {
        this.name = name;
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }

    @Override
    public String toString() {
        return name + " (major=" + majorAxis + ", minor=" + minorAxis + ")";
    }
}

class Triangle implements Shape {
    private final String name;
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void scale(double factor) {
        sideA *= factor;
        sideB *= factor;
        sideC *= factor;
    }

    @Override
    public String toString() {
        return name + " (sides=" + sideA + ", " + sideB + ", " + sideC + ")";
    }
}

class EquilateralTriangle implements Shape {
    private final String name;
    private double side;

    EquilateralTriangle(String name, double side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public void scale(double factor) {
        side *= factor;
    }

    @Override
    public String toString() {
        return name + " (side=" + side + ")";
    }
}