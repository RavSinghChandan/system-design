package mediator.concreteMediator;

import mediator.colleage.Colleage;
import mediator.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleage> colleagues = new ArrayList<>();
    @Override
    public void addColleage(Colleage colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public void sendMessage(String message, Colleage sender) {
        for (Colleage colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }
}
