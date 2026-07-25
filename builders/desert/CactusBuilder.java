package aov.builders.desert;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Rectangle;
import aov.villageobjects.Tree;
import aov.villageobjects.VillageObject;
public class CactusBuilder implements VillageObjectBuilder {

    private Tree cactus;

    @Override
    public void reset() {
        cactus = new Tree("Saguaro Cactus");
    }

    @Override
    public void buildBase() {
        cactus.addShape(new Rectangle(0.8, 1, "Sandy Roots"));
    }

    @Override
    public void buildMiddle() {
        cactus.addShape(new Rectangle(0.8, 5, "Green Cactus Trunk"));
    }

    @Override
    public void buildTop() {
        cactus.addShape(new Rectangle(0.4, 1.5, "Cactus Arm"));
    }

    @Override
    public VillageObject getResult() {
        return cactus;
    }
}