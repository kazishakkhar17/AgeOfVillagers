package aov.builders.modern;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Rectangle;
import aov.shapes.Square;
import aov.villageobjects.VillageObject;
import aov.villageobjects.WaterSource;
public class SwimmingPoolBuilder implements VillageObjectBuilder {

    private WaterSource pool;

    @Override
    public void reset() {
        pool = new WaterSource("Swimming Pool");
    }

    @Override
    public void buildBase() {
        pool.addShape(new Rectangle(8, 4, "Concrete Basin"));
    }

    @Override
    public void buildMiddle() {
        pool.addShape(new Rectangle(7.5, 3.5, "Chlorinated Water"));
    }

    @Override
    public void buildTop() {
        pool.addShape(new Square(1, "Ceramic Tile Border"));
    }

    @Override
    public VillageObject getResult() {
        return pool;
    }
}
