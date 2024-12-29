package bridge.implementor.concreteImplementors;

import bridge.implementor.Skill;

public class PalmReadingSkill implements Skill {
    @Override
    public void useSkill() {
        System.out.println("reading palms accurately.");
    }
}
