package bridge.client;

import bridge.abstraction.Chandan;
import bridge.implementor.Skill;
import bridge.implementor.concreteImplementors.CodingSkill;
import bridge.implementor.concreteImplementors.PalmReadingSkill;
import bridge.refinedAbstraction.PalmReader;
import bridge.refinedAbstraction.SoftwareDeveloper;

public class ClientChandan {
    public static void main(String[] args) {
        // Create skills
        Skill codingSkill = new CodingSkill();
        Skill palmReadingSkill = new PalmReadingSkill();

        // Create Chandan objects with different roles and skills
        Chandan chandanDeveloper = new SoftwareDeveloper(codingSkill);
        Chandan chandanPalmReader = new PalmReader(palmReadingSkill);

        // Perform tasks
        chandanDeveloper.performTask();
        chandanPalmReader.performTask();
    }
}
