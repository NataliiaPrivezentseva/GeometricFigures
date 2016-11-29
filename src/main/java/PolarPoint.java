class PolarPoint {
    private double r = 0;
    private double t = 0;

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
