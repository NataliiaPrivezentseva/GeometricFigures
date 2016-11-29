class Square extends AbstractFigure {
    private double side = 0;

    Square(CartesianPoint originCartesian, double side) {
        super(originCartesian);
        this.side = side;
    }

    Square(PolarPoint originPolar, double side) {
        super(originPolar);
        this.side = side;
    }

    Square(double side) {
        super();
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }
}
