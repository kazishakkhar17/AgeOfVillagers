package aov.shapes;

public class Triangle implements Shape {
    private final double base;
    private final double height;
    private final String material;

    public Triangle(double base, double height, String material) {
        this.base = base;
        this.height = height;
        this.material = material;
    }

    @Override
    public void draw() {
        System.out.printf("  - Triangle [base %.1f, height %.1f] made of %s%n", base, height, material);
    }
}
