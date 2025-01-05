package decorator.chandan;

public class VastuExpertDecorator extends PersonDecorator{
    public VastuExpertDecorator(Person person) {
        super(person);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", an expert in Vastu Shastra";
    }
}
