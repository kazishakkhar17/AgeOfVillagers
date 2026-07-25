package aov.builders.modern;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Circle;
import aov.shapes.Rectangle;
import aov.villageobjects.Tree;
import aov.villageobjects.VillageObject;

public class MangoTreeBuilder implements VillageObjectBuilder {

    private Tree tree;

    @Override
    public void reset() {
        tree = new Tree("Mango Tree");
    }

    @Override
    public void buildBase() {
        tree.addShape(new Rectangle(0.6, 1, "Roots/Soil"));
    }

    @Override
    public void buildMiddle() {
        tree.addShape(new Rectangle(0.6, 4, "Wood Trunk"));
    }

    @Override
    public void buildTop() {
        tree.addShape(new Circle(2.5, "Dense Green Foliage"));
    }

    @Override
    public VillageObject getResult() {
        return tree;
    }
}
