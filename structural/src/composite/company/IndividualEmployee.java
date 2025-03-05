package composite.company;

//2. Leaf
public class IndividualEmployee implements Employee{
    private String name;
    private String role;

    public IndividualEmployee(String role, String name) {
        this.role = role;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Name is : "+name +" Role is : "+role);
    }
}
