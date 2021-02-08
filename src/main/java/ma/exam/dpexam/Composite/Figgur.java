package ma.exam.dpexam.Composite;


import lombok.AllArgsConstructor;
import lombok.Data;
import ma.exam.dpexam.Aspect.MyLog;
import ma.exam.dpexam.Observer.Observable;
import ma.exam.dpexam.Observer.Observer;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.Serializable;

@Component
public abstract class Figgur implements Observer, Serializable {

    public Point p;

    public Figgur(Point p ){
        this.p=p;
    }
    @MyLog
    public abstract double surface();
    @MyLog
    public abstract double piremiter();
    @MyLog
    public abstract void draw();

}
