interface Figure {
    String getFigureName();

    double getPerimeter();

    double getArea();

    void moveFigure(CartesianPoint originCartesian);

    void moveFigure(PolarPoint originPolar);

    CartesianPoint getCartesianCoordinates();

    PolarPoint getPolarCoordinates();
}
