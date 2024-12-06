package command.concreteCommands;

import command.command.Command;
import command.receiver.Receiver;

public class ConcreteCommand1 implements Command {

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("execute method of ConcreteCommand1 ...");
        receiver.performAction();
    }
}
