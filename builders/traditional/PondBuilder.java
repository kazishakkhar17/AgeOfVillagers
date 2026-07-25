package aov.builders.traditional;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Circle;
import aov.villageobjects.VillageObject;
import aov.villageobjects.WaterSource;
public class PondBuilder implements VillageObjectBuilder {

    private WaterSource pond;

    @Override
    public void reset() {
        pond = new WaterSource("Pond");
    }

    @Override
    public void buildBase() {
        pond.addShape(new Circle(3, "Natural Mud Bed"));
    }

    @Override
    public void buildMiddle() {
        pond.addShape(new Circle(2.7, "Still Water"));
    }

    @Override
    public void buildTop() {
        pond.addShape(new Circle(3.2, "Lily Pads & Reeds"));
    }

    @Override
    public VillageObject getResult() {
        return pond;
    }
}
