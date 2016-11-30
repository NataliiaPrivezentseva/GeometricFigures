class Rectangle extends AbstractFigure {
    private double length = 0;
    private double width = 0;

    Rectangle(CartesianPoint originCartesian, double length, double width) {
        super(originCartesian);
        this.length = length;
        this.width = width;
    }

    Rectangle(PolarPoint originPolar, double length, double width) {
        super(originPolar);
        this.length = length;
        this.width = width;
    }

    Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public String getFigureName() {
        return RECTANGLE_NAME;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }
}

