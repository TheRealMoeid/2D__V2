public class GeneralTriangle extends BaseTriangle implements Triangle {
    public GeneralTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public ShapeType getType() {
        return null;
    }
}