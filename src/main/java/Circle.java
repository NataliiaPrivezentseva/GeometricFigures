public class Circle extends AbstractFigure {
    private double radius = 0;

    Circle(CartesianPoint originCartesian, double radius) {
        super(originCartesian);
        this.radius = radius;
    }

    Circle(PolarPoint originPolar, double radius) {
        super(originPolar);
        this.radius = radius;
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public String getFigureName() {
        return "circle";
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
