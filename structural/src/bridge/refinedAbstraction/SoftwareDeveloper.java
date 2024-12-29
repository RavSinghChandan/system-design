package bridge.refinedAbstraction;

import bridge.abstraction.Chandan;
import bridge.implementor.Skill;

public class SoftwareDeveloper implements Chandan {

    private Skill skill;

    public SoftwareDeveloper(Skill skill) {
        this.skill = skill; // Link abstraction to implementor
    }

    @Override
    public void performTask() {
        System.out.print("Chandan as a Software Developer is ");
        skill.useSkill();
    }
}
