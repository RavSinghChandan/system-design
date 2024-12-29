package bridge.refinedAbstraction;

import bridge.abstraction.Chandan;
import bridge.implementor.Skill;

public class PalmReader implements Chandan {
    private Skill skill;

    public PalmReader(Skill skill) {
        this.skill = skill; // Link abstraction to implementor
    }

    @Override
    public void performTask() {
        System.out.print("Chandan as a Palm Reader is ");
        skill.useSkill();
    }
}
