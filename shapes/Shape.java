package aov.shapes;

/**
 * Common interface for every simple shape (Rectangle, Triangle, Circle, Square)
 * AND for composite VillageObjects (House, Tree, WaterSource), since a
 * VillageObject is itself treated as a "drawable" thing made of shapes.
 * This is the Component role in the Composite pattern.
 */
public interface Shape {
    void draw();
}
