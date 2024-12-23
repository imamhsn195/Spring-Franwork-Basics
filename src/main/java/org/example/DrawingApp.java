package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Shape shape = (Shape) context.getBean("circle");
//        String message = context.getMessage("greeting",null,"Default message from main function", null);
//        System.out.println(message);
        shape.draw();
    }
}
