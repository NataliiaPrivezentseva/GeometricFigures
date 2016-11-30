interface Figure {

    String RECTANGLE_NAME = "rectangle";
    String SQUARE_NAME = "square";
    String CIRCLE_NAME = "circle";

    String getFigureName();

    double getPerimeter();

    double getArea();

    void moveFigure(CartesianPoint originCartesian);

    void moveFigure(PolarPoint originPolar);

    CartesianPoint getCartesianCoordinates();

    PolarPoint getPolarCoordinates();
}
