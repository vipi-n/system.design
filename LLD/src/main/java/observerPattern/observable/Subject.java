package observerpattern.observable;

import observerpattern.observer.Observer;

public interface Subject {

    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(String message);
}
