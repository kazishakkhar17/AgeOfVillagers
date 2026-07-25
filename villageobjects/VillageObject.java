package aov.villageobjects;

import aov.shapes.Shape;
import java.util.ArrayList;
import java.util.List;

/**
 * COMPOSITE PATTERN (Composite role):
 * A VillageObject (House / Tree / WaterSource) IS-A Shape, but it is built
 * from a collection of simpler Shape parts (Rectangle, Triangle, Circle...).
 * Client code can call draw() on it exactly like it would on a single simple
 * shape, without caring that it's actually a group of shapes underneath.
 */
public abstract class VillageObject implements Shape {

    protected final String name;
    protected final List<Shape> shapes = new ArrayList<>();

    protected VillageObject(String name) {
        this.name = name;
    }

    /** Used by Builders to add simple shapes one at a time. */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println(name + " is composed of:");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
