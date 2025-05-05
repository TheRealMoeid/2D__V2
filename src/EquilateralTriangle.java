public class EquilateralTriangle extends BaseTriangle implements Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(sideA, 2);
    }

    @Override
    public ShapeType getType() {
        return null;
    }
}