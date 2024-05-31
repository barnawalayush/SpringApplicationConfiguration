package org.barnawal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("23")
    private int age;

//    @Autowired   if we remove from here then mention autowired in setter method
//    @Qualifier("laptop")
    private Computer com;

    public Alien() {
        System.out.println("Alien created");
    }

//    public Alien(int age, Laptop lap) {
//        System.out.println("para constructor called");
//        this.age = age;
//        this.lap = lap;
//    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired  // It is preferred one SETTER INJECTION
    public void setCom(Computer com) {
        this.com = com;
    }
}
