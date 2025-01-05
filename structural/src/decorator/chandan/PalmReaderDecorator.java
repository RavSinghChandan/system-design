package decorator.chandan;

public class PalmReaderDecorator extends PersonDecorator{
    public PalmReaderDecorator(Person person) {
        super(person);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", a skilled Palm Reader";
    }
}
