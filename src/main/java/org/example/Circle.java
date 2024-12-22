package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    private MessageSource messageSource;

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("drawing.circle", null, "Message from Circle draw method", null));
        System.out.println(messageSource.getMessage("drawing.point", new Object[] { center.getX(), center.getY()}, "Drawing circle point default message", null));
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
