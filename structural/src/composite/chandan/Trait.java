package composite.chandan;

public class Trait implements ChandanAspect {
    private String description;

    public Trait(String description) {
        this.description = description;
    }

    @Override
    public void show() {
        System.out.println("Chandan shows: " + description);
    }
}
