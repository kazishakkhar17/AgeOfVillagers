package aov.shapes;

public class Rectangle implements Shape {
    private final double width;
    private final double height;
    private final String material;

    public Rectangle(double width, double height, String material) {
        this.width = width;
        this.height = height;
        this.material = material;
    }

    @Override
    public void draw() {
        System.out.printf("  - Rectangle [%.1f x %.1f] made of %s%n", width, height, material);
    }
}
