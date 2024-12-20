package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {
    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    private List<Point> points;
    private ApplicationContext context;

    public void draw(){
        for (Point point: points) {
            System.out.println("Point = ( " + point.getX() + ", " + point.getY() + " )");
        }
    }


    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean Name: " + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }
}
