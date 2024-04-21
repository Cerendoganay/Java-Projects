package shapes3d;

public class TestShapes3d {
    public static void main(String[] args) {
        Cylinder cl1 = new Cylinder(5.0,8.0);
        System.out.println(cl1);
        System.out.println("cl1.area() ="+cl1.area() );
        System.out.println("cl1.volume() ="+cl1.volume() );

        Cube cb1 = new Cube(5.0);
        System.out.println(cb1);
        System.out.println("cb1.area() ="+cb1.area());
        System.out.println("cb1.volume() ="+cb1.volume() );


    }
}