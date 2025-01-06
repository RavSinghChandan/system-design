package mediator.chandan;

import java.util.ArrayList;
import java.util.List;

public class CommunicationMediator implements Mediator{
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receive(message);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
}
