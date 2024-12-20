package abstractFactory.abstractProduct;

import abstractFactory.chandan.Chandan;

public interface AbstractProductB {
    void display();

    class WorkingChandan extends Chandan {
        String name;
        int age;
        String major;

        public WorkingChandan(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        @Override
        public String toString() {
            return "WorkingChandan{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", major='" + major + '\'' +
                    '}';
        }

        @Override
        public void printInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Major: " + major);
        }
    }
}
