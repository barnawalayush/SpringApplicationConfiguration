package org.barnawal;

import org.barnawal.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt = context.getBean(Desktop.class);
//        DEFAULT NAME CAN BE METHOD NAME
//        Desktop dt = context.getBean("desktop", Desktop.class);

        Alien obj1 = (Alien) context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop dt = context.getBean("com2", Desktop.class);
//        dt.compile();



//        FOR XML BASED CONFIGURATION

        // to get container
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Alien obj1 = (Alien) context.getBean("alien");
//        Alien obj1 = (Alien) context.getBean("alien", Alien.class);

//        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();
//
//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);

//        Computer com = context.getBean(Laptop.class);
//        Desktop obj = context.getBean(Desktop.class);


    }
}