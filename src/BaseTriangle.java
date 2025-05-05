public abstract class BaseTriangle implements Shape2D {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public BaseTriangle(double sideA, double sideB, double sideC) {
        validateSides(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private void validateSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public abstract double getArea();
}