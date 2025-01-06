package iterator.chandan;

public class Client {
    public static void main(String[] args) {
        // Creating a concrete aggregate for Chandan's skills
        SkillsAggregate chandanSkills = new SkillsAggregate();
        chandanSkills.addSkill("Palm Reading");
        chandanSkills.addSkill("Vastu Shastra");
        chandanSkills.addSkill("Software Development");
        chandanSkills.addSkill("Driving");
        chandanSkills.addSkill("Music");

        // Creating an iterator
        Iterator<String> skillIterator = chandanSkills.createIterator();

        System.out.println("Chandan's Skills:");
        while (skillIterator.hasNext()) {
            System.out.println("- " + skillIterator.next());
        }
    }
}
