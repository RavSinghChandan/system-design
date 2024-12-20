package abstractFactory.chandan;

public class StudentChandan extends Chandan {
    String name;
    int age;
    String major;

    public StudentChandan(String name,int age, String major) {
        this.name= name;
        this.age = age;
        this.major = major;
    }

    @Override
    public void printInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}
