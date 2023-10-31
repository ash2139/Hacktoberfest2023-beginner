import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Scientific Calculator");
        System.out.println("---------------------------");

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Quit");
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Calculator exiting. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                if (choice != 5 && choice != 7) {
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();

                    switch (choice) {
                        case 1:
                            System.out.println("Result: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("Result: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("Result: " + (num1 * num2));
                            break;
                        case 4:
                            if (num2 == 0) {
                                System.out.println("Error: Division by zero is not allowed.");
                            } else {
                                System.out.println("Result: " + (num1 / num2));
                            }
                            break;
                        case 5:
                            if (num1 < 0) {
                                System.out.println("Error: Square root of a negative number is not allowed.");
                            } else {
                                System.out.println("Result: " + Math.sqrt(num1));
                            }
                            break;
                        case 6:
                            System.out.println("Result: " + Math.pow(num1, num2));
                            break;
                    }
                }
            } else {
                System.out.println("Invalid choice. Please enter a valid option (1-7).");
            }
        }

        scanner.close();
    }
}
