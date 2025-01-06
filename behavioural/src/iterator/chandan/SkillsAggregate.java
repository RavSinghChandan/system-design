package iterator.chandan;

import java.util.ArrayList;
import java.util.List;

public class SkillsAggregate implements Aggregate<String>{

    private final List<String> skills = new ArrayList<>();

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public Iterator<String> createIterator() {
        return new ChandanIterator(skills);
    }
}
