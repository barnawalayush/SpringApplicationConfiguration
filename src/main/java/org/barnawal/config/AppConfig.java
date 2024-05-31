package org.barnawal.config;


import org.barnawal.Alien;
import org.barnawal.Computer;
import org.barnawal.Desktop;
import org.barnawal.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.barnawal")
public class AppConfig {




    // IF WE DONT USE COMPONENT

//    @Bean
//    public Alien alien(@Autowired Computer com){
//        Alien alien = new Alien();
//        alien.setAge(26);
//        alien.setCom(com);
//        return alien;
//    }

//    @Bean
//    public Alien alien(@Qualifier("desktop") Computer com){
//        Alien alien = new Alien();
//        alien.setAge(26);
//        alien.setCom(com);
//        return alien;
//    }

//    @Bean
//    public Alien alien(Computer com){
//        Alien alien = new Alien();
//        alien.setAge(26);
//        alien.setCom(com);
//        return alien;
//    }
//
//    @Bean(name = {"com2", "desktop"})
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
