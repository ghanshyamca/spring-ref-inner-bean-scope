package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        String path = "org/spring.xml";
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext(path);
        Department department = ctx.getBean(Department.class);
        System.out.println(department);
        Employee employee = ctx.getBean(Employee.class);
        System.out.println(employee);
        Depot depot = ctx.getBean(Depot.class);
        System.out.println(depot);
    }
}
