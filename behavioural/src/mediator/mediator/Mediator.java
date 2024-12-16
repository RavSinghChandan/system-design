package mediator.mediator;

import mediator.colleage.Colleage;

public interface Mediator {
     void sendMessage(String message, Colleage sender);
    void addColleage(Colleage colleage);
}
