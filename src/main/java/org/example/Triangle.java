package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
//public class Triangle{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    public void draw(){
        System.out.println("Point A = ( " + pointA.getX() + ", " + pointA.getY() + " )");
        System.out.println("Point B = ( " + pointB.getX() + ", " + pointB.getY() + " )");
        System.out.println("Point C = ( " + pointC.getX() + ", " + pointC.getY() + " )");
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialisation method is called");
    }
    public void my_init(){
        System.out.println("my_init method is called.");
    }
    public void clean_up(){
        System.out.println("clean_up method is called.");
    }
}
