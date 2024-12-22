package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointA")
    public void setCenter(Point center) {
        this.center = center;
    }

    private Point center;
    private ApplicationEventPublisher publisher;

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
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }
    @PostConstruct
    public void initializeCircle(){
        System.out.println("Circle initialized here.");
    }
    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroy method called here.");
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
