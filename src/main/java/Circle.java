public class Circle extends AbstractFigure {
    private double radius = 0;

    public Circle(CartesianPoint originCartesian, double radius) {
        super(originCartesian);
        this.radius = radius;
    }

    public Circle(PolarPoint originPolar, double radius) {
        super(originPolar);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
