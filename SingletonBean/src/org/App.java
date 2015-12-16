package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        String path = "org/spring.xml";
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext(path);
        Car car = (Car) ctx.getBean("c1");
        System.out.println(car);
        
        car.setModel("Swift");
        
        car = (Car) ctx.getBean("c1");
        System.out.println(car);
    }
}
