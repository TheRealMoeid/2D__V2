public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new GeneralTriangle(3, 4, 5);
        Triangle triangle2 = new RightTriangle(3, 4);
        Triangle triangle3 = new IsoscelesTriangle(5, 8);
        Triangle triangle4 = new EquilateralTriangle(6);

        printTriangleInfo(triangle1);
        printTriangleInfo(triangle2);
        printTriangleInfo(triangle3);
        printTriangleInfo(triangle4);
    }

    private static void printTriangleInfo(Triangle triangle) {
        System.out.println("Type: " + triangle.getClass().getSimpleName());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("---------------------");
    }
}