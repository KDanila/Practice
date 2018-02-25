package DuckTrainingPatterns.Practice1;


import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList<Quackable> flock = new ArrayList<Quackable>();

    void addDuck(Quackable duck) {
        flock.add(duck);
    }

    @Override
    public void quack() {
        Iterator i = flock.iterator();
        while(i.hasNext()){
            Quackable q = (Quackable)i.next();
            q.quack();
        }/*
        for (Quackable q : flock) {
            q.quack();
        }*/
    }
}
