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
        String length = "length";
        String width = "width";
        double[] origin = Input.getOrigin();
        CartesianPoint originCartesian = new CartesianPoint(origin[0], origin[1]);
        myFigure = new Rectangle(originCartesian, Input.getParameter(length), Input.getParameter(width));
        return myFigure;
    }

    private static Figure createRectangleInOriginPolar() {
        Figure myFigure;
        String length = "length";
        String width = "width";
        double[] origin = Input.getOrigin();
        PolarPoint originPolar = new PolarPoint(origin[0], origin[1]);
        myFigure = new Rectangle(originPolar, Input.getParameter(length), Input.getParameter(width));
        return myFigure;
    }

    private static Figure createRectangleInDefaultOrigin() {
        String length = "length";
        String width = "width";
        return new Rectangle(Input.getParameter(length), Input.getParameter(width));
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

    private static Figure createSquareInOriginCartesian() {
        Figure myFigure;
        String side = "side";
        double[] origin = Input.getOrigin();
        CartesianPoint originCartesian = new CartesianPoint(origin[0], origin[1]);
        myFigure = new Square(originCartesian, Input.getParameter(side));
        return myFigure;
    }

    private static Figure createSquareInOriginPolar() {
        Figure myFigure;
        String side = "side";
        double[] origin = Input.getOrigin();
        PolarPoint originPolar = new PolarPoint(origin[0], origin[1]);
        myFigure = new Square(originPolar, Input.getParameter(side));
        return myFigure;
    }

    private static Figure createSquareInDefaultOrigin() {
        String side = "side";
        return new Square(Input.getParameter(side));
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
        String radius = "radius";
        double[] origin = Input.getOrigin();
        CartesianPoint originCartesian = new CartesianPoint(origin[0], origin[1]);
        myFigure = new Circle(originCartesian, Input.getParameter(radius));
        return myFigure;
    }

    private static Figure createCircleInOriginPolar() {
        Figure myFigure;
        String radius = "radius";
        double[] origin = Input.getOrigin();
        PolarPoint originPolar = new PolarPoint(origin[0], origin[1]);
        myFigure = new Circle(originPolar, Input.getParameter(radius));
        return myFigure;
    }

    private static Figure createCircleInDefaultOrigin() {
        String radius = "radius";
        return new Circle(Input.getParameter(radius));
    }

}
