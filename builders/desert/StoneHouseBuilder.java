package aov.builders.desert;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Rectangle;
import aov.shapes.Square;
import aov.villageobjects.House;
import aov.villageobjects.VillageObject;
public class StoneHouseBuilder implements VillageObjectBuilder {

    private House house;

    @Override
    public void reset() {
        house = new House("Stone House");
    }

    @Override
    public void buildBase() {
        house.addShape(new Rectangle(5, 0.5, "Carved Stone"));
    }

    @Override
    public void buildMiddle() {
        house.addShape(new Rectangle(5, 3.5, "Sandstone Blocks"));
    }

    @Override
    public void buildTop() {
        house.addShape(new Square(5, "Flat Clay Roof"));
    }

    @Override
    public VillageObject getResult() {
        return house;
    }
}