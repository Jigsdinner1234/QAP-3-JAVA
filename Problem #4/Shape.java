public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape: " + name +
                "\nArea: " + String.format("%.2f", area()) +
                "\nPerimeter: " + String.format("%.2f", perimeter()) +
                "\n";
    }
}