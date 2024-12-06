package command.invoker;

import command.command.Command;

public class Invoker {

    private Command command;

    public  void setCommand(Command command){
        this.command=command;
    }

    public void  invoke(){
        System.out.println("invoke method of Invoker class ...");
        if(command != null){
            command.execute();
        }else {
            System.out.println("No command is set ...");
        }

    }
}
