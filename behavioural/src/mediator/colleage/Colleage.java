package mediator.colleage;

import mediator.mediator.Mediator;

public abstract class Colleage {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}
