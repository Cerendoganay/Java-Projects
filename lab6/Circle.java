public class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public boolean intersect(Circle c) {
        // if (dist. between cent1 and cent2) <= (rad1 + rad2)
        return (center.distanceto(c.getCenter()) <= (radius + c.getRadius()));
    }
}