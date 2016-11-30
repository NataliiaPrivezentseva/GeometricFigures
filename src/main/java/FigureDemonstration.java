import java.util.InputMismatchException;

class FigureDemonstration {

    static void demonstrateFigure(Figure myFigure) {
        printFigureDescription(myFigure);
        demonstrateFigureMoving(myFigure);
    }

    private static void demonstrateFigureMoving(Figure myFigure) {
        int systemForMove = Input.getOriginKind("Chose Coordinate system in which you want set point for moving figure:\n" +
                "1 — Cartesian system\n" +
                "2 — Polar system\n", 2);
        switch (systemForMove) {
            case 1:
                demonstrateMovingCartesian(myFigure);
                break;
            case 2:
                demonstrateMovingPolar(myFigure);
                break;
            default:
                throw new InputMismatchException();
        }
    }

    private static void demonstrateMovingCartesian(Figure myFigure) {
        double[] origin = Input.getOrigin();
        CartesianPoint newOriginCartesian = new CartesianPoint(origin[0], origin[1]);
        myFigure.moveFigure(newOriginCartesian);

        CartesianPoint newCartesianCoordinates = myFigure.getCartesianCoordinates();
        System.out.println("New coordinates of origin in Cartesian system are " + newCartesianCoordinates);

        PolarPoint newPolarCoordinates = myFigure.getPolarCoordinates();
        System.out.println("New coordinates of origin in polar system are " + newPolarCoordinates);
    }

    private static void demonstrateMovingPolar(Figure myFigure) {
        double[] origin = Input.getOrigin();
        PolarPoint newOriginPolar = new PolarPoint(origin[0], origin[1]);
        myFigure.moveFigure(newOriginPolar);

        CartesianPoint nextCartesianCoordinates = myFigure.getCartesianCoordinates();
        System.out.println("New coordinates of origin in Cartesian system are " + nextCartesianCoordinates);

        PolarPoint nextPolarCoordinates = myFigure.getPolarCoordinates();
        System.out.println("New coordinates of origin in polar system are " + nextPolarCoordinates);
    }

    private static void printFigureDescription(Figure myFigure) {
        String figureName = myFigure.getFigureName();
        System.out.println("The perimeter of the " + figureName + " is " + myFigure.getPerimeter() +
                "\nThe area of the " + figureName + " is " + myFigure.getArea() +
                "\nCoordinates of origin in Cartesian system are " + myFigure.getCartesianCoordinates() +
                "\nCoordinates of origin in polar system are " + myFigure.getPolarCoordinates());
    }

}