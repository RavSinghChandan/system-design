package proxy.realSubject;

import proxy.subject.Subject;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Request made to the real subject");
    }
}
