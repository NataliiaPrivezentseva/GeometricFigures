import java.util.Scanner;

class DemonstrateFigure {

    static void doDemonstration(Figure myFigure) {
        printFigureDescription(myFigure);
        demonstrateFigureMoving(myFigure);
    }

    private static void demonstrateFigureMoving(Figure myFigure) {
        System.out.println("Выберете, в какой системе кооддинат вы хотите переместить стартовую точку фигуры:\n" +
                "1 — Cartesian System\n" +
                "2 — Polar System\n");
        Scanner chosenSystemForMove = new Scanner(System.in);
        int systemForMove = chosenSystemForMove.nextInt();
        switch (systemForMove) {
            case 1:
                demonstrateMovingCartesian(myFigure);
                break;
            case 2:
                demonstrateMovingPolar(myFigure);
                break;
            default:
                System.out.println("Please, choose proper option!");
                System.exit(-1);
        }
    }

    private static void demonstrateMovingCartesian(Figure myFigure) {
        System.out.println("Введите координаты точки (x, y), в которую переместить фигуру");
        Scanner newCartesianPoint = new Scanner(System.in);
        double[] coordinatesCartesian = new double[2];
        for (int j = 0; j < 2; j++) {
            coordinatesCartesian[j] = newCartesianPoint.nextDouble();
        }
        CartesianPoint newOriginCartesian = new CartesianPoint(coordinatesCartesian[0], coordinatesCartesian[1]);
        myFigure.moveFigure(newOriginCartesian);

        CartesianPoint newCartesianCoordinates = myFigure.getCartesianCoordinates();
        System.out.println("Координаты фигуры в Декартовой системе координат: " + newCartesianCoordinates);

        PolarPoint newPolarCoordinates = myFigure.getPolarCoordinates();
        System.out.println("Координаты фигуры в Полярной системе координат: " + newPolarCoordinates);
    }

    private static void demonstrateMovingPolar(Figure myFigure) {
        System.out.println("Введите координаты точки (r, t), в которую переместить фигуру");
        Scanner newPolarPoint = new Scanner(System.in);
        double[] coordinatesPolar = new double[2];
        for (int j = 0; j < 2; j++) {
            coordinatesPolar[j] = newPolarPoint.nextDouble();
        }
        PolarPoint newOriginPolar = new PolarPoint(coordinatesPolar[0], coordinatesPolar[1]);
        myFigure.moveFigure(newOriginPolar);

        CartesianPoint nextCartesianCoordinates = myFigure.getCartesianCoordinates();
        System.out.println("Координаты фигуры в Декартовой системе координат: " + nextCartesianCoordinates);

        PolarPoint nextPolarCoordinates = myFigure.getPolarCoordinates();
        System.out.println("Координаты фигуры в Полярной системе координат: " + nextPolarCoordinates);
    }

    private static void printFigureDescription(Figure myFigure) {
        double perimeter = myFigure.getPerimeter();
        double area = myFigure.getArea();
        CartesianPoint pointCartesian = myFigure.getCartesianCoordinates();
        PolarPoint pointPolar = myFigure.getPolarCoordinates();

        System.out.println("Периметр фигуры равен " + perimeter +
                "\nПлощадь фигуры равна " + area +
                "\nКоординаты фигуры в Декартовой системе координат: " + pointCartesian +
                "\nКоординаты фигуры в Полярной системе координат: " + pointPolar);
    }
}