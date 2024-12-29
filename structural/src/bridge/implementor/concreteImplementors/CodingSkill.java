package bridge.implementor.concreteImplementors;

import bridge.implementor.Skill;

public class CodingSkill implements Skill {
    @Override
    public void useSkill() {
        System.out.println("coding efficiently.");
    }
}
