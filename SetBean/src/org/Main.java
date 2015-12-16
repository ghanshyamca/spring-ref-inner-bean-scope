package org;

//import java.util.EnumSet;
//import java.util.HashSet;
import java.util.Set;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext
                        ("org/appConfig.xml");
        System.out.println(ctx.getBean(Set.class));
    }
}
