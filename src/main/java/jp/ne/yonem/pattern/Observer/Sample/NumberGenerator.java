package jp.ne.yonem.pattern.Observer.Sample;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    private final List<Observer> observers = new ArrayList<>();        // Observer‚½‚¿‚ğ•Û

    public void addObserver(Observer observer) {    // Observer‚ğ’Ç‰Á
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // Observer‚ğíœ
        observers.remove(observer);
    }

    public void notifyObservers() {               // Observer‚Ö’Ê’m

        for (var observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();                // ”‚ğæ“¾‚·‚é

    public abstract void execute();                 // ”‚ğ¶¬‚·‚é
}
