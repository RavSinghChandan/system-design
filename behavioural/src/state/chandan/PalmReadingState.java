package state.chandan;

public class PalmReadingState implements ServiceState{
    @Override
    public void serve() {
        System.out.println("Chandan is providing a palm reading: Predicting your past, present, and future.");
    }
}
