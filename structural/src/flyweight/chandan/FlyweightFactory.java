package flyweight.chandan;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private final Map<String, ExpertProfile> profiles = new HashMap<>();

    public ExpertProfile getExpertProfile(String type) {

        ExpertProfile profile = profiles.get(type);
        if (profile == null) {
            if (type.equalsIgnoreCase("Chandan")) {
                profile = new ChandanProfile();
                profiles.put(type, profile);
                System.out.println("Creating new ChandanProfile instance.");
            } else {
                throw new IllegalArgumentException("Unknown profile type: " + type);
            }
        } else {
            System.out.println("Reusing existing ChandanProfile instance.");
        }
        return profile;
    }
}
