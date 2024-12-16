package observer;

import observer.concreteObserver.ConcreteObserver;
import observer.concreteSubject.ConcreteSubject;
import observer.observer.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("State Changed to A");
        subject.setState("State Changed to B");

        subject.removeObserver(observer1);
        subject.setState("State Changed to C");
    }
}
