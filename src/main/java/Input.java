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

    static int getOriginKind() {
        int originKind = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Chose what origin do you need for your figure:\n" +
                    "1 — I want to set origin in Cartesian system\n" +
                    "2 — I want to set origin in Polar system\n" +
                    "3 — I chose default value of the origin\n");

            if (!input.hasNextInt()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' is not proper choice! Try again!");
            } else {
                originKind = input.nextInt();
                if (originKind <= 0 || originKind > 3) {
                    System.out.println("\'" + originKind + "\' is not proper choice! Try again!");
                }
            }
        }
        while (originKind <= 0 || originKind > 3);

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
        System.out.println("You set following coordinates of origin: (" + originPoint[0] + ", " + originPoint[1] + ")");
        return originPoint;
    }

    // последние три метода очень подобны. Следует ли это упростить?
    static double getLength() {
        double length;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please, enter length of your figure.  It must be positive number");

            while (!input.hasNextDouble()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' — improper value of length. " +
                        "Please, enter the proper length of the figure");
            }
            length = input.nextDouble();
        } while (length <= 0);

        return length;
    }

    static double getWidth() {
        double width;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please, enter width of your figure.  It must be positive number");

            while (!input.hasNextDouble()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' — improper value of the width. " +
                        "Please, enter the proper width of the figure");
            }
            width = input.nextDouble();
        } while (width <= 0);

        return width;
    }

    static double getRadius() {
        double radius;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please, enter radius of your figure.  It must be positive number");

            while (!input.hasNextDouble()) {
                String usersInput = input.next();
                System.out.println("\'" + usersInput + "\' — improper value of the radius. " +
                        "Please, enter the proper radius of the figure");
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        return radius;
    }
}