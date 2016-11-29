import java.util.Scanner;

public class MakeAndDemonstrateFigures {

    public static void main(String[] args) {

        System.out.println("Please, choose what figure you want to create:\n" +
                "1 — Rectangle\n" +
                "2 — Square\n" +
                "3 — Circle\n");

        Scanner input = new Scanner(System.in);
        int chosenFigure;
        chosenFigure = input.nextInt();

        Figure myFigure = null;

        switch (chosenFigure) {
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
                System.out.println("Please, choose proper option!");
                System.exit(-1);
        }

        doDemonstration(myFigure);
    }

    /**
     * узнаем, какую начальную точку хочет пользователь
     *
     * @return пункт, который выбрал пользователь
     */
    private static int getOrigin() {
        System.out.println("Выберите начальную точку для вашей фигуры:\n" +
                "1 — задать начальную точку в Декартовой системе координат\n" +
                "2 — задать начальную точку в Полярной системе координат\n" +
                "3 — начальная точка в позиции по умолчанию (0, 0)");

        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * метод для создания прямоугольника нужного вида
     *
     * @return объект myFigure, созданный на основе класса Rectangle
     */
    private static Figure createRectangle() {
        Figure myFigure;
        int usersChoice = getOrigin();
        switch (usersChoice) {
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
                System.out.println("Please, choose proper option!");
                System.exit(-1);
                return null;
        }
    }

    private static Figure createRectangleInOriginCartesian() {
        Figure myFigure;
        System.out.println("Please, enter x, y, length and width of your figure");
        Scanner inputParametersCartesian = new Scanner(System.in);
        double[] parametersCartesian = new double[4];
        for (int i = 0; i < 4; i++) {
            parametersCartesian[i] = inputParametersCartesian.nextDouble();
        }
        CartesianPoint originCartesian = new CartesianPoint(parametersCartesian[0], parametersCartesian[1]);
        myFigure = new Rectangle(originCartesian, parametersCartesian[2], parametersCartesian[3]);
        return myFigure;
    }

    private static Figure createRectangleInOriginPolar() {
        Figure myFigure;
        System.out.println("Please, enter r, t, length and width of your figure");
        Scanner inputParametersPolar = new Scanner(System.in);
        double[] parametersPolar = new double[4];
        for (int i = 0; i < 4; i++) {
            parametersPolar[i] = inputParametersPolar.nextDouble();
        }
        PolarPoint originPolar = new PolarPoint(parametersPolar[0], parametersPolar[1]);
        myFigure = new Rectangle(originPolar, parametersPolar[2], parametersPolar[3]);
        return myFigure;
    }

    private static Figure createRectangleInDefaultOrigin() {
        Figure myFigure;
        System.out.println("Please, enter length and width of your figure");
        Scanner inputParameters = new Scanner(System.in);
        double[] parameters = new double[2];
        for (int i = 0; i < 2; i++) {
            parameters[i] = inputParameters.nextDouble();
        }
        myFigure = new Rectangle(parameters[0], parameters[1]);
        return myFigure;
    }

    /**
     * метод для создания квадрата нужного типа
     *
     * @return — объект myFigure, созданный на основе класса Square
     */
    private static Figure createSquare() {
        Figure myFigure;
        int usersChoice = getOrigin();
        switch (usersChoice) {
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
                System.out.println("Please, choose proper option!");
                System.exit(-1);
                return null;
        }
    }

    private static Figure createSquareInOriginCartesian() {
        Figure myFigure;
        System.out.println("Please, enter x, y and side of your figure");
        Scanner inputParametersCartesian = new Scanner(System.in);
        double[] parametersCartesian = new double[3];
        for (int i = 0; i < 3; i++) {
            parametersCartesian[i] = inputParametersCartesian.nextDouble();
        }
        CartesianPoint originCartesian = new CartesianPoint(parametersCartesian[0], parametersCartesian[1]);
        myFigure = new Square(originCartesian, parametersCartesian[2]);
        return myFigure;
    }

    private static Figure createSquareInOriginPolar() {
        Figure myFigure;
        System.out.println("Please, enter r, t and side of your figure");
        Scanner inputParametersPolar = new Scanner(System.in);
        double[] parametersPolar = new double[3];
        for (int i = 0; i < 3; i++) {
            parametersPolar[i] = inputParametersPolar.nextDouble();
        }
        PolarPoint originPolar = new PolarPoint(parametersPolar[0], parametersPolar[1]);
        myFigure = new Square(originPolar, parametersPolar[2]);
        return myFigure;
    }

    private static Figure createSquareInDefaultOrigin() {
        Figure myFigure;
        System.out.println("Please, enter side of your figure");
        Scanner inputParameters = new Scanner(System.in);
        double parameters = inputParameters.nextDouble();
        myFigure = new Square(parameters);
        return myFigure;
    }

    /**
     * метод для создания круга нужного типа
     *
     * @return — объект myFigure, созданный на основе класса Circle
     */
    private static Figure createCircle() {
        Figure myFigure;
        int usersChoice = getOrigin();
        switch (usersChoice) {
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
                System.out.println("Please, choose proper option!");
                System.exit(-1);
                return null;
        }
    }

    private static Figure createCircleInOriginCartesian() {
        Figure myFigure;
        System.out.println("Please, enter x, y and radius of your figure");
        Scanner inputParametersCartesian = new Scanner(System.in);
        double[] parametersCartesian = new double[3];
        for (int i = 0; i < 3; i++) {
            parametersCartesian[i] = inputParametersCartesian.nextDouble();
        }
        CartesianPoint originCartesian = new CartesianPoint(parametersCartesian[0], parametersCartesian[1]);
        myFigure = new Circle(originCartesian, parametersCartesian[2]);
        return myFigure;
    }

    private static Figure createCircleInOriginPolar() {
        Figure myFigure;
        System.out.println("Please, enter r, t and radius of your figure");
        Scanner inputParametersPolar = new Scanner(System.in);
        double[] parametersPolar = new double[3];
        for (int i = 0; i < 3; i++) {
            parametersPolar[i] = inputParametersPolar.nextDouble();
        }
        PolarPoint originPolar = new PolarPoint(parametersPolar[0], parametersPolar[1]);
        myFigure = new Circle(originPolar, parametersPolar[2]);
        return myFigure;
    }

    private static Figure createCircleInDefaultOrigin() {
        Figure myFigure;
        System.out.println("Please, enter radius of your figure");
        Scanner inputParameters = new Scanner(System.in);
        double parameters = inputParameters.nextDouble();
        myFigure = new Circle(parameters);
        return myFigure;
    }

    /**
     * метод для демонстрации возможностей и состояний фигуры
     * @param myFigure
     */
    private static void doDemonstration(Figure myFigure) {
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