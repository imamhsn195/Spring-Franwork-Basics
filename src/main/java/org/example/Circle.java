package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{
    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointA")
    public void setCenter(Point center) {
        this.center = center;
    }

    private Point center;

    @Override
    public void draw() {
        System.out.println("Drawing circle with point (" + center.getX() + ", " + center.getY() + ")");
    }
    @PostConstruct
    public void initializeCircle(){
        System.out.println("Circle initialized here.");
    }
    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroy method called here.");
    }
}
