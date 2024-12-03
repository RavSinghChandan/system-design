package proxy.proxy;

import proxy.realSubject.RealSubject;
import proxy.subject.Subject;

public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        // Add logging functionality before calling RealSubject
        System.out.println("Logging: Proxy request initiated");

        // Lazy initialization of RealSubject
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        // Forward request to RealSubject
        realSubject.request();

        // Add logging functionality after calling RealSubject
        System.out.println("Logging: Proxy request completed");
    }
}
