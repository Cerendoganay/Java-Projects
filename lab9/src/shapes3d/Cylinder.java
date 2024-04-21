package shapes3d;

import shapes2d.Circle;

public class Cylinder extends Circle {
    private  double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * super.area() + (height * super.perimeter());
    }

    public double volume() {
        return super.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}