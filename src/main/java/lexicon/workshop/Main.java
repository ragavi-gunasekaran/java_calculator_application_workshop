package lexicon.workshop;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    // To get console based input from the user
    static Scanner scan = new Scanner(System.in);

    static void main() {

        IO.println("********* Welcome to Calculator Application *********");
        menu();
        char input = scan.next().charAt(0);
        boolean choice = true;
        while (choice) {
            try {
                switch (input) {
                    case '+':
                        IO.println("In Addition");
                        IO.println("Do you want to add more than 2 operants?(Yes/No)");
                        String option1 = scan.next();
                        if (option1.equalsIgnoreCase("Yes")) {
                            IO.println("Please enter how many numbers you want to add ? ");
                            int index = scan.nextInt();
                            double[] add = new double[index];
                            for (int i = 0; i < index; i++) {
                                IO.print("Enter Input number " + (i + 1) + " : ");
                                add[i] = scan.nextDouble();
                            }
                            double sum = 0;
                            for (double num : add) {
                                sum += num;
                            }
                            IO.println("Addition of the numbers is " + (sum));
                            break;
                        } else {
                            IO.println("Addition of only 2 numbers");
                            IO.print("Enter Input number 1 : ");
                            int number1 = scan.nextInt();
                            IO.print("Enter Input number 2 : ");
                            int number2 = scan.nextInt();
                            IO.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
                            break;
                        }
                    case '-':
                        IO.println("In Subtraction");
                        IO.println("Do you want to subtract more than 2 operants?(Yes/No)");
                        String option2 = scan.next();
                        if (option2.equalsIgnoreCase("Yes")) {
                            IO.println("Please enter how many numbers you want to subtract ? ");
                            int index = scan.nextInt();
                            double[] sub = new double[index];
                            for (int i = 0; i < index; i++) {
                                IO.print("Enter Input number " + (i + 1) + " : ");
                                sub[i] = scan.nextDouble();
                            }
                            double subtract = 0;
                            for (double num : sub) {
                                subtract -= num;
                            }
                            IO.println("Subtraction of the numbers is " + (subtract));
                            break;
                        } else {
                            IO.println("Subtraction of only 2 numbers");
                            IO.print("Enter Input number 1 : ");
                            int number1 = scan.nextInt();
                            IO.print("Enter Input number 2 : ");
                            int number2 = scan.nextInt();
                            IO.println("Subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
                            break;
                        }
                    case '*':
                        IO.println("In Multiplication");
                        IO.print("Enter Input number 1 : ");
                        int number1 = scan.nextInt();
                        IO.print("Enter Input number 2 : ");
                        int number2 = scan.nextInt();
                        IO.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
                        break;
                    case '/':
                        IO.println("In Division");
                        IO.print("Enter Input number 1 : ");
                        int number3 = scan.nextInt();
                        IO.print("Enter Input number 2 : ");
                        int number4 = scan.nextInt();
                        if (number4 != 0) {
                            double div = number3 / number4;
                            IO.println("Division of " + number3 + " and " + number4 + " is " + div);
                        } else {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        break;
                    case '^':
                        IO.println("In Power Operation");
                        IO.print("Enter Input number 1 : ");
                        double number5 = scan.nextDouble();
                        IO.print("Enter Input number 2 : ");
                        double number6 = scan.nextDouble();
                        IO.println("Power of " + number5 + " and " + number6 + " is " + Math.pow(number5, number6));
                        break;
                    case 's':
                        IO.println("In Square Root");
                        IO.print("Enter number: ");
                        double number = scan.nextDouble();
                        if (number < 0)
                            throw new ArithmeticException("Cannot perform with Negative number");
                        IO.println("Square Root of " + number + ": " + Math.sqrt(number));
                        break;
                    case 'f':
                        IO.println("In Factorial Operation");
                        IO.print("Enter number: ");
                        int factorialNumber = scan.nextInt();
                        if (factorialNumber < 0) {
                            throw new IllegalArgumentException("Cannot perform with Negative number");
                        }
                        long fact = 1;
                        for (int i = 2; i <= factorialNumber; i++)
                            fact *= i;
                        IO.println("Factorial of " + factorialNumber + ": " + fact);
                        break;
                    default:
                        IO.println("Wrong option entered. Please enter any one of the operators (+,-,*,/,^,s,f) to perform Arithmetic operation");
                        break;

                }
            } catch (InputMismatchException e) {
                IO.println("Please enter valid input number.");
                scan.nextLine();
            } catch (ArithmeticException | IllegalArgumentException e) {
                IO.println("Error: " + e.getMessage());
            }
            IO.println("Do you want to continue arithmetic operations?(Yes/No)");
            boolean isRight = true;
            while (isRight) {
                String value = scan.next();
                if (value.equalsIgnoreCase("Yes")) {
                    menu();
                    input = scan.next().charAt(0);
                    choice = true;
                    isRight = false;
                } else if (value.equalsIgnoreCase("No")) {
                    choice = false;
                    IO.println("Exiting the Calculator application. Thank you !!!!!!");
                    isRight = false;
                } else {
                    IO.println("Wrong option entered. Please enter Yes or No");
                    isRight = true;
                }
            }
        }
    }

    static void menu() {
        IO.println("Please select the below choice of operation(+,-,*,/,^,s,f) which you want to perform.");
        IO.println("+ Addition");
        IO.println("- Subtraction");
        IO.println("* Multiplication");
        IO.println("/ Division");
        IO.println("^ Power");
        IO.println("s Square Root");
        IO.println("f Factorial");
    }
}