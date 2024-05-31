package org.barnawal;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop Object created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using desktop");
    }
}
