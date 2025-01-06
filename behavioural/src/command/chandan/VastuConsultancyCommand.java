package command.chandan;

public class VastuConsultancyCommand implements Command{
    private Chandan chandan;

    public VastuConsultancyCommand(Chandan chandan) {
        this.chandan = chandan;
    }

    @Override
    public void execute() {
        chandan.provideVastuConsultancy();
    }
}
