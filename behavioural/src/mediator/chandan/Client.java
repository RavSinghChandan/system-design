package mediator.chandan;

public class Client {
    public static void main(String[] args) {
        // Create a mediator
        Mediator mediator = new CommunicationMediator();

        // Create colleagues
        Colleague chandan = new Chandan(mediator, "Chandan");
        Colleague friend1 = new Friend(mediator, "Amit");
        Colleague friend2 = new Friend(mediator, "Sneha");

        // Add colleagues to mediator
        mediator.addColleague(chandan);
        mediator.addColleague(friend1);
        mediator.addColleague(friend2);

        // Communication
        chandan.send("Hello, everyone!");
        friend1.send("Hi Chandan!");
        friend2.send("Hey Chandan, how's it going?");
    }
}
