import java.util.Scanner;

class Input {

    static int getFigureName() {
        int chosenFigure = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please, choose what figure you want to create:\n" +
                    "1 — Rectangle\n" +
                    "2 — Square\n" +
                    "3 — Circle\n");

            if (!input.hasNextInt()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' is not proper choice! Try again!");
            } else {
                chosenFigure = input.nextInt();
                if (chosenFigure <= 0 || chosenFigure > 3) {
                    System.out.println("\'" + chosenFigure + "\' is not proper choice! Try again!");
                }
            }
        }
        while (chosenFigure <= 0 || chosenFigure > 3);

        return chosenFigure;
    }

    static int getOriginKind(String message, int options) {
        int originKind = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(message);

            if (!input.hasNextInt()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' is not proper choice! Try again!");
            } else {
                originKind = input.nextInt();
                if (originKind <= 0 || originKind > options) {
                    System.out.println("\'" + originKind + "\' is not proper choice! Try again!");
                }
            }
        }
        while (originKind <= 0 || originKind > options);

        return originKind;
    }

    static double[] getOrigin() {
        double[] originPoint = new double[2];
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.println("Please, enter coordinates of origin");

        while (counter < 2) {
            if (!input.hasNextDouble()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' is not proper choice! Try again!");
            } else {
                originPoint[counter] = input.nextDouble();
                counter++;
            }
        }
        return originPoint;
    }

    static double getParameter(String parameterName) {
        double parameter;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please, enter " + parameterName + " of your figure.  It must be positive number");

            while (!input.hasNextDouble()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' — improper value of " + parameterName +
                        "! Please, enter the proper length of the figure");
            }
            parameter = input.nextDouble();
        } while (parameter <= 0);

        return parameter;
    }

}