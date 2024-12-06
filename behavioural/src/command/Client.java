package command;

import command.concreteCommands.ConcreteCommand1;
import command.invoker.Invoker;
import command.receiver.Receiver;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        ConcreteCommand1 command1 = new ConcreteCommand1(receiver);
        invoker.setCommand(command1);
        invoker.invoke();

        ConcreteCommand1 command2 = new ConcreteCommand1(receiver);
        invoker.setCommand(command2);
        invoker.invoke();

    }
}
