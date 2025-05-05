public class RightTriangle extends BaseTriangle implements Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, Math.hypot(base, height));
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public ShapeType getType() {
        return null;
    }
}