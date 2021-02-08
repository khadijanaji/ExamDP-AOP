package ma.exam.dpexam.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import ma.exam.dpexam.Aspect.MyLog;
import ma.exam.dpexam.Aspect.SecuredByAspect;
import ma.exam.dpexam.Composite.Figgur;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;
import java.util.ArrayList;

@Component
@Data @AllArgsConstructor
public class Parametrage implements Observable{
    public  int colorC;
    public int colorS;
    public int epaisseurC;
    public ArrayList<Observer> figurs;

    public Parametrage(){
        figurs=new ArrayList<>();
    }

    @Override
    public void notif() {
        for(Observer o : figurs){
            o.update(this);
        }
    }
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void remove(Figgur f) {
        figurs.remove(f);
    }

    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void add(Figgur f) {
        figurs.add(f);
    }
}
