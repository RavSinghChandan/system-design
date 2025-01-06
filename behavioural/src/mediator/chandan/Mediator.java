package mediator.chandan;

public interface Mediator {
    void sendMessage(String message, Colleague sender);
    void addColleague(Colleague colleague);
}
