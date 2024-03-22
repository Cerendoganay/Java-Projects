public class Rectangle {
    private int sideA;
    private int sideB;
    private Point topleft;

    public Rectangle(int sideA, int sideB, Point topleft) {
        this.sideA = sideA; //width
        this.sideB = sideB;  //height
        this.topleft = topleft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public Point getTopleft() {
        return topleft;
    }

    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }
    public int area() {
        return sideA * sideB;
    }

    public int perimeter() {
        return 2 * (sideA + sideB);
    }

    public Point[] corners() {
        Point[] corners = new Point[4];
        corners[0] = topleft;
        corners[1] = new Point(topleft.getxCoord() + sideA, topleft.getyCoord());
        corners[2] = new Point(topleft.getxCoord() + sideA, topleft.getyCoord() - sideB);
        corners[3] = new Point(topleft.getxCoord(), topleft.getyCoord() - sideB);

        return corners;
    }
}