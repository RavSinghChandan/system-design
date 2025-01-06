package facade.chandan;

public class HomeAutomationFacade {
    private Lights lights;
    private AirConditioner airConditioner;
    private MusicSystem musicSystem;

    public HomeAutomationFacade() {
        this.lights = new Lights();
        this.airConditioner = new AirConditioner();
        this.musicSystem = new MusicSystem();
    }

    // Simplified interface to turn everything ON
    public void activatePartyMode() {
        System.out.println("Activating Party Mode...");
        lights.turnOn();
        airConditioner.turnOn();
        airConditioner.setTemperature(22);
        musicSystem.playMusic();
        System.out.println("Party Mode Activated!");
    }

    // Simplified interface to turn everything OFF
    public void deactivatePartyMode() {
        System.out.println("Deactivating Party Mode...");
        musicSystem.stopMusic();
        airConditioner.turnOff();
        lights.turnOff();
        System.out.println("Party Mode Deactivated!");
    }
}
