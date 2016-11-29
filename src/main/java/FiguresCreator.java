import java.util.InputMismatchException;

class FiguresCreator {

    static Figure createFigure() {
        Figure myFigure;

        switch (Input.getFigureName()) {
            case 1:
                myFigure = createRectangle();
                break;
            case 2:
                myFigure = createSquare();
                break;
            case 3:
                myFigure = createCircle();
                break;
            default:
                throw new InputMismatchException();
        }
        return myFigure;
    }

    private static Figure createRectangle() {
        Figure myFigure;
        int origin = Input.getOriginKind();
        switch (origin) {
            case 1:
                myFigure = createRectangleInOriginCartesian();
                return myFigure;
            case 2:
                myFigure = createRectangleInOriginPolar();
                return myFigure;
            case 3:
                myFigure = createRectangleInDefaultOrigin();
                return myFigure;
            default:
                throw new InputMismatchException();
        }
    }

    private static Figure createRectangleInOriginCartesian() {
        Figure myFigure;
        double[] origin = Input.getOrigin();
        CartesianPoint originCartesian = new CartesianPoint(origin[0], origin[1]);
        myFigure = new Rectangle(originCartesian, Input.getLength(), Input.getWidth());
        return myFigure;
    }

    private static Figure createRectangleInOriginPolar() {
        Figure myFigure;
        double[] origin = Input.getOrigin();
        PolarPoint originPolar = new PolarPoint(origin[0], origin[1]);
        myFigure = new Rectangle(originPolar, Input.getLength(), Input.getWidth());
        return myFigure;
    }

    private static Figure createRectangleInDefaultOrigin() {
        return new Rectangle(Input.getLength(), Input.getWidth());
    }

    private static Figure createSquare() {
        Figure myFigure;
        int origin = Input.getOriginKind();
        switch (origin) {
            case 1:
                myFigure = createSquareInOriginCartesian();
                return myFigure;
            case 2:
                myFigure = createSquareInOriginPolar();
                return myFigure;
            case 3:
                myFigure = createSquareInDefaultOrigin();
                return myFigure;
            default:
                throw new InputMismatchException();
        }
    }

    // написать ли новый метод для получения стороны квадрата? или как приравнять сторону квадрата к ширине или длине?
    private static Figure createSquareInOriginCartesian() {
        Figure myFigure;
        double[] origin = Input.getOrigin();
        CartesianPoint originCartesian = new CartesianPoint(origin[0], origin[1]);
        myFigure = new Square(originCartesian, Input.getLength());
        return myFigure;
    }

    private static Figure createSquareInOriginPolar() {
        Figure myFigure;
        double[] origin = Input.getOrigin();
        PolarPoint originPolar = new PolarPoint(origin[0], origin[1]);
        myFigure = new Square(originPolar, Input.getLength());
        return myFigure;
    }

    private static Figure createSquareInDefaultOrigin() {
        return new Square(Input.getLength());
    }

    private static Figure createCircle() {
        Figure myFigure;
        int origin = Input.getOriginKind();
        switch (origin) {
            case 1:
                myFigure = createCircleInOriginCartesian();
                return myFigure;
            case 2:
                myFigure = createCircleInOriginPolar();
                return myFigure;
            case 3:
                myFigure = createCircleInDefaultOrigin();
                return myFigure;
            default:
                throw new InputMismatchException();
        }
    }

    private static Figure createCircleInOriginCartesian() {
        Figure myFigure;
        double[] origin = Input.getOrigin();
        CartesianPoint originCartesian = new CartesianPoint(origin[0], origin[1]);
        myFigure = new Circle(originCartesian, Input.getRadius());
        return myFigure;
    }

    private static Figure createCircleInOriginPolar() {
        Figure myFigure;
        double[] origin = Input.getOrigin();
        PolarPoint originPolar = new PolarPoint(origin[0], origin[1]);
        myFigure = new Circle(originPolar, Input.getRadius());
        return myFigure;
    }

    private static Figure createCircleInDefaultOrigin() {
        return new Circle(Input.getRadius());
    }

}
