package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
//        Triangle triangle  = new Triangle();
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring-config.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Triangle triangle = (Triangle) context.getBean("triangle-alias2");
        triangle.draw();
    }
}
