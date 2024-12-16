package mediator.concreteColleage;

import mediator.colleage.Colleage;
import mediator.mediator.Mediator;

public class ConcreteColleagueB extends Colleage {
    private Mediator mediator;
    @Override
    public void sendMessage(String message) {
        System.out.println("ColleagueB sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ColleagueB received: " + message);
    }
}
