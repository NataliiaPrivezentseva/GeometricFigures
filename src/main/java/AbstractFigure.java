abstract class AbstractFigure implements Figure {
    private CartesianPoint originCartesian;
    private PolarPoint originPolar;

    AbstractFigure() {
        originCartesian = new CartesianPoint();
        originPolar = convertToPolarCoordinates();
    }

    AbstractFigure(CartesianPoint originCartesian) {
        this.originCartesian = originCartesian;
        originPolar = convertToPolarCoordinates();
    }

    AbstractFigure(PolarPoint originPolar) {
        this.originPolar = originPolar;
        originCartesian = convertToCartesianCoordinates();
    }

    private PolarPoint convertToPolarCoordinates() {
        double r = Math.sqrt(originCartesian.getX() * originCartesian.getX() +
                originCartesian.getY() * originCartesian.getY());
        double t = Math.atan(originCartesian.getX() / originCartesian.getY());
        return new PolarPoint(r, t);
    }

    private CartesianPoint convertToCartesianCoordinates() {
        double x = originPolar.getR() * Math.cos(originPolar.getT());
        double y = originPolar.getR() * Math.sin(originPolar.getT());
        return new CartesianPoint(x, y);
    }

    public void moveFigure(CartesianPoint originCartesian) {
        this.originCartesian = originCartesian;
        originPolar = convertToPolarCoordinates();
    }

    public void moveFigure(PolarPoint originPolar) {
        this.originPolar = originPolar;
        originCartesian = convertToCartesianCoordinates();
    }

    public CartesianPoint getCartesianCoordinates() {
        return originCartesian;
    }

    public PolarPoint getPolarCoordinates() {
        return originPolar;
    }
}