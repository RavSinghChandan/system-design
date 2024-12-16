package mediator;

import mediator.colleage.Colleage;
import mediator.concreteColleage.ConcreteColleagueA;
import mediator.concreteColleage.ConcreteColleagueB;
import mediator.concreteMediator.ConcreteMediator;
import mediator.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();


        Colleage colleagueA = new ConcreteColleagueA();
        Colleage colleagueB = new ConcreteColleagueB();

        mediator.addColleage(colleagueA);
        mediator.addColleage(colleagueB);

       // colleagueA.sendMessage("Hello from A!",colleagueA);
       // colleagueB.sendMessage("Hi from B!");
    }

}
