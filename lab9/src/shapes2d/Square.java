package shapes2d;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getSide() {
        return side;
    }

}