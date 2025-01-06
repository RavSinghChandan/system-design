package command.chandan;

public class FarmingCommand implements Command{
    private Chandan chandan;

    public FarmingCommand(Chandan chandan) {
        this.chandan = chandan;
    }

    @Override
    public void execute() {
        chandan.manageFarm();
    }
}
