package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Staff staff = context.getBean("staff", Staff.class);
        staff.doWork();

        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        Engine engine = context.getBean("engine", Engine.class);
        System.out.println(engine);

        Wheels wheels = context.getBean("wheels", Wheels.class);
        System.out.println(wheels);

        Transmition transmition = context.getBean("transmition", Transmition.class);
        System.out.println(transmition);

    }
}
