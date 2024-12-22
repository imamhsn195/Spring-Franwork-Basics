package org.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
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
