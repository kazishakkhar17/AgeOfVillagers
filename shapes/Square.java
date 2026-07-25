package aov.shapes;

public class Square implements Shape {
    private final double side;
    private final String material;

    public Square(double side, String material) {
        this.side = side;
        this.material = material;
    }

    @Override
    public void draw() {
        System.out.printf("  - Square [side %.1f] made of %s%n", side, material);
    }
}
