package command.chandan;

public class PalmReadingCommand implements Command{
    private Chandan chandan;

    public PalmReadingCommand(Chandan chandan) {
        this.chandan = chandan;
    }

    @Override
    public void execute() {
        chandan.doPalmReading();
    }
}
