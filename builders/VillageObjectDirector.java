package aov.builders;

import aov.villageobjects.VillageObject;

/**
 * BUILDER PATTERN (Director role):
 * Knows the correct ORDER of construction steps, but not the details of
 * what shapes get added — that's delegated to whichever builder it's given.
 */
public class VillageObjectDirector {

    private VillageObjectBuilder builder;

    public VillageObjectDirector(VillageObjectBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(VillageObjectBuilder builder) {
        this.builder = builder;
    }

    public VillageObject construct() {
        builder.reset();
        builder.buildBase();
        builder.buildMiddle();
        builder.buildTop();
        return builder.getResult();
    }
}
