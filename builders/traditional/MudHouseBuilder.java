package aov.builders.traditional;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Circle;
import aov.shapes.Rectangle;
import aov.villageobjects.House;
import aov.villageobjects.VillageObject;
public class MudHouseBuilder implements VillageObjectBuilder {

    private House house;

    @Override
    public void reset() {
        house = new House("Mud House");
    }

    @Override
    public void buildBase() {
        house.addShape(new Rectangle(5, 0.4, "Compacted Mud"));  // foundation
    }

    @Override
    public void buildMiddle() {
        house.addShape(new Rectangle(5, 3, "Mud Bricks"));       // walls
    }

    @Override
    public void buildTop() {
        house.addShape(new Circle(3, "Thatch/Straw"));           // domed thatched roof
    }

    @Override
    public VillageObject getResult() {
        return house;
    }
}
