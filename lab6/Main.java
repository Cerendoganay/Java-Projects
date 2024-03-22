public class Main {
    public static void Main(String[] args) {
        Circle c1 = new Circle(5, new Point(0,0));
        Circle c2 = new Circle(7, new Point(5,12));

        if (c1.intersect(c2))
            System.out.println("Circle1 is intersecting with circle2.");
        else
            System.out.println("Circle1 is NOT intersecting with circle2.");
    }
}