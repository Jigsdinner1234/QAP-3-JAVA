public class Demo {

    public static void main(String[] args) {

        // Create a Point
        Point p1 = new Point(2.5f, 4.5f);

        System.out.println("Point:");
        System.out.println(p1);

        // Create a MovablePoint
        MovablePoint mp = new MovablePoint(2.5f, 4.5f, 1.0f, 2.0f);

        System.out.println("\nMovable Point:");
        System.out.println(mp);

        // Move the point
        mp.move();

        System.out.println("\nAfter move():");
        System.out.println(mp);

        // Move again
        mp.move();

        System.out.println("\nAfter second move():");
        System.out.println(mp);
    }
}