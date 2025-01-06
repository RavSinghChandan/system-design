package command.chandan;

public class Client {
    public static void main(String[] args) {
        // Receiver
        Chandan chandan = new Chandan();

        // Commands
        Command palmReading = new PalmReadingCommand(chandan);
        Command vastuConsultancy = new VastuConsultancyCommand(chandan);
        Command farming = new FarmingCommand(chandan);

        // Invoker
        TaskInvoker invoker = new TaskInvoker();

        // Execute tasks
        invoker.setCommand(palmReading);
        invoker.executeCommand();

        invoker.setCommand(vastuConsultancy);
        invoker.executeCommand();

        invoker.setCommand(farming);
        invoker.executeCommand();
    }
}
