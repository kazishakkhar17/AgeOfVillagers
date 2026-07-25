package aov.shapes;

public class Circle implements Shape {
    private final double radius;
    private final String material;

    public Circle(double radius, String material) {
        this.radius = radius;
        this.material = material;
    }

    @Override
    public void draw() {
        System.out.printf("  - Circle [radius %.1f] made of %s%n", radius, material);
    }
}
