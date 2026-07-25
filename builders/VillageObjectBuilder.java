package aov.builders;

import aov.villageobjects.VillageObject;

/**
 * BUILDER PATTERN:
 * Defines the fixed sequence of steps used to construct any VillageObject
 * (House, Tree, or WaterSource) by adding simple shapes one at a time.
 * Each concrete builder implements these steps differently (different
 * shapes/materials), producing a different "flavor" of the same object type.
 */
public interface VillageObjectBuilder {
    void reset();
    void buildBase();
    void buildMiddle();
    void buildTop();
    VillageObject getResult();
}
