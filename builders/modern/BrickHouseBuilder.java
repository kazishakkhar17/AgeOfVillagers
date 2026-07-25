package aov.builders.modern;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Rectangle;
import aov.shapes.Triangle;
import aov.villageobjects.House;
import aov.villageobjects.VillageObject;
public class BrickHouseBuilder implements VillageObjectBuilder {

    private House house;

    @Override
    public void reset() {
        house = new House("Brick House");
    }

    @Override
    public void buildBase() {
        house.addShape(new Rectangle(6, 0.5, "Brick"));   // foundation
    }

    @Override
    public void buildMiddle() {
        house.addShape(new Rectangle(6, 4, "Brick"));     // walls
    }

    @Override
    public void buildTop() {
        house.addShape(new Triangle(6, 2, "Clay Tile"));  // roof
    }

    @Override
    public VillageObject getResult() {
        return house;
    }
}
