package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        String path = "org/spring.xml";
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext(path);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
