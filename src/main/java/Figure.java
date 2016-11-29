interface Figure {
    double getPerimeter();

    double getArea();

    void moveFigure(CartesianPoint originCartesian);

    void moveFigure(PolarPoint originPolar);

    CartesianPoint getCartesianCoordinates();

    PolarPoint getPolarCoordinates();
}
