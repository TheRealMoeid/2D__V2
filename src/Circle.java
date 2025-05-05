public abstract class Circle extends Shape2D implements ICircle {
    private float radius;

    public Circle(IPoint origin, float radius) {
        super(origin);
        setRadius(radius);
    }

    @Override public float getRadius() { return radius; }
    @Override public void setRadius(float radius) {
        if (radius <= 0) throw new IllegalArgumentException("radius must be > 0");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
