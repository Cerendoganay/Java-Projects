package shapes3d;

import shapes2d.Square;

public class Cube extends Square {
    public Cube(double side) {
        super(side);
    }

    @Override
    public double area() {
        return super.area();
    }

    public double volume() {
        return Math.pow(super.getSide(), 3);
    }

    @Override
    public String toString() {
        return "Cube{}" + super.toString();
    }
}
