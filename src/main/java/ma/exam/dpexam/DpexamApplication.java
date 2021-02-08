package ma.exam.dpexam;

import ma.exam.dpexam.Aspect.AppContext;
import ma.exam.dpexam.Composite.*;
import ma.exam.dpexam.Observer.Observable;
import ma.exam.dpexam.Observer.Observer;
import ma.exam.dpexam.Observer.Parametrage;
import ma.exam.dpexam.stratgy.Dessin;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DpexamApplication {

    public static void main(String[] args) {
        AppContext.authenticateUser("admin","admin",new String[]{"USER"});
        SpringApplication.run(DpexamApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Circle t,Rectangle r,Parametrage p){
        return args -> {
            t.surface();
            r.piremiter();
            p.add(t);
            p.add(r);

        };
    }
}
