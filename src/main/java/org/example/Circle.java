package org.example;

public class Circle implements Shape{
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    private Point center;

    @Override
    public void draw() {
        System.out.println("Drawing circle with point (" + center.getX() + ", " + center.getY() + ")");
    }
}
