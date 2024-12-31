package composite.chandan;

public class Client {
    public static void main(String[] args) {
        // Create Chandan's traits
        Trait imaginative = new Trait("Imaginative mind");
        Trait driver = new Trait("Good car driver");
        Trait musician = new Trait("Plays an instrument");
        Trait vastuExpert = new Trait("Vastu Shastra Expert");

        // Create Chandan with his name
        Chandan chandan = new Chandan("Chandan Kumar Singh");

        // Add traits to Chandan
        chandan.addAspect(imaginative);
        chandan.addAspect(driver);
        chandan.addAspect(musician);
        chandan.addAspect(vastuExpert);

        // Show all of Chandan's aspects
        chandan.show();
    }
}
