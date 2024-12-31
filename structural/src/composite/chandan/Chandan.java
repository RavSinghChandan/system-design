package composite.chandan;

import java.util.ArrayList;
import java.util.List;

public class Chandan implements ChandanAspect {
    private String name;
    private List<ChandanAspect> aspects = new ArrayList<>();

    public Chandan(String name) {
        this.name = name;
    }

    // Add a new face or aspect to Chandan
    public void addAspect(ChandanAspect aspect) {
        aspects.add(aspect);
    }

    @Override
    public void show() {
        System.out.println(name + "'s Aspects:");
        for (ChandanAspect aspect : aspects) {
            aspect.show();
        }
    }
}
