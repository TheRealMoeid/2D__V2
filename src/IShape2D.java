public interface IShape2D {

    IPoint getCenter();
    void setCenter(IPoint center);

    double getArea();
    double getPerimeter();

    ShapeType getType();

    double distance(IShape2D other);

    //--[ factory ]-------------------------

    static IShape2D create(ShapeType type, IPoint center, float param1, float param2){
        // todo: implement factory
        return null;
    }
}

enum ShapeType{
    Unknown, Circle, Rect, Square
}