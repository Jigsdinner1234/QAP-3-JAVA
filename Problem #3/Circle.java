public class Circle extends Ellipse {

    public Circle(String name, double radius) {
        super(name, radius, radius);
    }
}

class Ellipse {
    private final String name;
    private final double radius1;
    private final double radius2;

    public Ellipse(String name, double radius1, double radius2) {
        this.name = name;
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public String getName() {
        return name;
    }

    public double getRadius1() {
        return radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    @Override
    public String toString() {
        return name + " [radius1=" + radius1 + ", radius2=" + radius2 + "]";
    }
}