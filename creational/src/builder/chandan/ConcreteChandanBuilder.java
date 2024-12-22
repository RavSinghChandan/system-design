package builder.chandan;

public class ConcreteChandanBuilder implements Builder {

    Chandan product = new Chandan();

    @Override
    public void buildName() {
        product.setName("Chandan Kumar Singh");
    }

    @Override
    public void buildAge() {
        product.setAge(28);
    }

    @Override
    public void buildOccupation() {
        product.setOccupation("Developer");
    }

    @Override
    public Chandan getResult() {
        return product;
    }
}
