package aov.builders.traditional;

import aov.builders.VillageObjectBuilder;
import aov.shapes.Rectangle;
import aov.shapes.Triangle;
import aov.villageobjects.Tree;
import aov.villageobjects.VillageObject;
public class BananaTreeBuilder implements VillageObjectBuilder {

    private Tree tree;

    @Override
    public void reset() {
        tree = new Tree("Banana Tree");
    }

    @Override
    public void buildBase() {
        tree.addShape(new Rectangle(0.4, 0.6, "Roots/Soil"));
    }

    @Override
    public void buildMiddle() {
        tree.addShape(new Rectangle(0.4, 3, "Fibrous Stem"));
    }

    @Override
    public void buildTop() {
        // broad banana leaves, modeled as elongated triangles
        tree.addShape(new Triangle(2, 1, "Broad Leaf"));
        tree.addShape(new Triangle(2, 1, "Broad Leaf"));
    }

    @Override
    public VillageObject getResult() {
        return tree;
    }
}
