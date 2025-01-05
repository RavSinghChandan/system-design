package decorator.chandan;

public abstract class PersonDecorator implements Person{
    private Person decoratedPerson;
    public PersonDecorator(Person person){
        this.decoratedPerson=person;
    }
    @Override
    public String getDescription() {
        return decoratedPerson.getDescription();
    }
}
