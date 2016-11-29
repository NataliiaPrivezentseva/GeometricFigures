class PolarPoint {
    private final double r;
    private final double t;

    PolarPoint() {
        this(0, 0);
    }

    PolarPoint(double r, double t) {
        this.r = r;
        this.t = t;
    }

    double getR() {
        return r;
    }

    double getT() {
        return t;
    }

    @Override
    public String toString() {
        return "r = " + r + ", t = " + t;
    }
}
