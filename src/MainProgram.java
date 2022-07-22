import java.util.Scanner;

public class MainProgram {

    // Scanner object is used for user input
    // Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
    private static Scanner scanner = new Scanner(System.in);

    /**
     * No Need to modify the main() method
     * @param args
     */
    public static void main(String[] args) {
        // Creating a Menu
        int choice = 0;
        while (true) {
            System.out.println("\n============== MAIN MENU ===============" +
                    "\n     1. Square Computations " +
                    "\n     2. Rectangle Computations" +
                    "\n     3. Circle Computations" +
                    "\n     4. Ellipse Computations" +
                    "\n     5. Exit");
            System.out.print("\n>> ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n 1. Square Computations ");
                    squareComputations();
                    break;

                case 2:
                    System.out.println("\n 2. Rectangle Computations");
                    rectangleComputations();
                    break;

                case 3:
                    System.out.println("\n 3. Circle Computations");
                    circleComputations();
                    break;

                case 4:
                    System.out.println("\n 4. Ellipse Computations");
                    ellipseComputations();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("INVALID INPUT!!!!");
            }
            if (choice == 5) {
                System.out.println("Exiting Now!!!");
                break;
            }
        }
    }

    /**
     * No need to modify this function
     * (You may use this as example)
     */
    private static void squareComputations() {
        // 1. Declare and Instantiate Square
        Square square = new Square();
        // 2. Ask for user input
        System.out.print("Input the side of the square: ");
        // 3. Read the input
        double side = scanner.nextDouble();
        // 4. Set the side value
        square.setLengthOfSide(side);
        // 5. Let the object calculate its area and perimeter
        System.out.println("\nThe area is " + square.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + square.calculatePerimeter() + " units.");
    }

    /**
     * No need to modify this function
     * (You may use this as example)
     */
    private static void rectangleComputations() {
        // 1. Declare and Instantiate Square
        Rectangle rect = new Rectangle();
        // 2. Ask for user input and read
        System.out.print("Input the length: ");
        double length = scanner.nextDouble();
        System.out.print("Input the width: ");
        double width = scanner.nextDouble();
        // 3. Set the width and length values
        rect.setWidth(width);
        rect.setLength(length);
        // 4. Let the object calculate its area and perimeter
        System.out.println("\nThe area is " + rect.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + rect.calculatePerimeter() + " units.");
    }

    private static void circleComputations() {
        // TODO: Complete code similar to above
    }

    private static void ellipseComputations() {
        // TODO:  Complete code similar to above
    }
}
