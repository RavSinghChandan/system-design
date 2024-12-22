package builder.chandan;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
// Director -> Builder -> Build Chandan (Step by step )
    public Chandan construct() {
        builder.buildName();
        builder.buildAge();
        builder.buildOccupation();
        return builder.getResult();
    }
}
