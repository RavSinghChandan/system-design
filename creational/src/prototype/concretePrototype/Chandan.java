package prototype.concretePrototype;

import prototype.prototype.PrototypeChandan;

public class Chandan implements PrototypeChandan {

    private String name;
    private int age;
    private String gender;
    private String profession;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chandan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

    public Chandan(String name, int age, String gender, String profession) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    @Override
    public PrototypeChandan cloneChandan() {
        return new Chandan(this.name,this.age,this.gender,this.profession);
    }
}
