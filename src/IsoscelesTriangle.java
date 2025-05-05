public class IsoscelesTriangle extends BaseTriangle implements Triangle {
    public IsoscelesTriangle(double equalSide, double base) {
        super(equalSide, equalSide, base);
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(sideA, 2) - Math.pow(sideC / 2, 2));
        return (sideC * height) / 2;
    }

    @Override
    public ShapeType getType() {
        return null;
    }
}