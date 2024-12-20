package abstractFactory.chandan;

public class WorkingChandan extends Chandan{
    String name;
    int age;
    String major;

    public WorkingChandan(String name,int age, String major) {
        this.name= name;
        this.age = age;
        this.major = major;
    }

    @Override
    public void printInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}
