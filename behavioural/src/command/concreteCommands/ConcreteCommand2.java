package command.concreteCommands;

import command.command.Command;
import command.receiver.Receiver;
import cor.concreteHandler.ConcreteHandler2;

public class ConcreteCommand2 implements Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver){
        this.receiver= receiver;
    }
    @Override
    public void execute() {
        System.out.println("execute method of  ConcreteCommand2 ..");
        receiver.performAnotherAction();
    }
}
