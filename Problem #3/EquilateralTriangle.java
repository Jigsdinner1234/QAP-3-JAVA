public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }
}

class Triangle {
    private final String name;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}