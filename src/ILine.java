public interface ILine {

    IPoint getStartPoint();
    IPoint getEndPoint();

    void setStartPoint(IPoint point);
    void setEndPoint(IPoint point);

    double length();

    //--[ factory ]-------------------------
    // todo: implement factory
}
