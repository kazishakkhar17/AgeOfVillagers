package aov.builders.desert;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Circle;
import aov.villageobjects.VillageObject;
import aov.villageobjects.WaterSource;
public class OasisBuilder implements VillageObjectBuilder {

    private WaterSource oasis;

    @Override
    public void reset() {
        oasis = new WaterSource("Oasis");
    }

    @Override
    public void buildBase() {
        oasis.addShape(new Circle(4, "Sand Basin"));
    }

    @Override
    public void buildMiddle() {
        oasis.addShape(new Circle(3.5, "Fresh Spring Water"));
    }

    @Override
    public void buildTop() {
        oasis.addShape(new Circle(4.5, "Palm Tree Ring"));
    }

    @Override
    public VillageObject getResult() {
        return oasis;
    }
}