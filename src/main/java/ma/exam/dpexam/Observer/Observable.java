package ma.exam.dpexam.Observer;

import ma.exam.dpexam.Composite.Figgur;

public interface Observable {

    void notif();
    void remove(Figgur f);
    void add(Figgur f);

}
