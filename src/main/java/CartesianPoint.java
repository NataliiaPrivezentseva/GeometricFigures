class CartesianPoint {
    private double x = 0;
    private double y = 0;

    CartesianPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
