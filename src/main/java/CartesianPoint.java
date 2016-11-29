class CartesianPoint {
    private final double x;
    private final double y;

    CartesianPoint(){
        this(0,0 );
    }

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
