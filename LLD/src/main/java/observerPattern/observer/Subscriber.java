package observerpattern.observer;

public class Subscriber implements Observer{

    String name;
    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received notification: " + videoTitle);
    }
}
