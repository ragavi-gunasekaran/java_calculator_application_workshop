package lexicon.workshop;

import java.util.Scanner;

public class Main {
    static void main() {

        // To get console based input from the user
        Scanner scan = new Scanner(System.in);

        IO.println("Welcome to Calculator Application");
        IO.println("Please give your input to perform any calculations");
        IO.print("Enter Input number 1 : ");
        int number1 = scan.nextInt();
        IO.print("Enter Input number 2 : ");
        int number2 = scan.nextInt();
        menu();
        char input = scan.next().charAt(0);
        boolean choice = true;

        while (choice) {
            switch (input) {
                case '+':
                    IO.println("In Addition");
                    IO.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
                    break;
                case '-':
                    IO.println("In Subtraction");
                    IO.println("Subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
                    break;
                case '*':
                    IO.println("In Multiplication");
                    IO.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
                    break;
                case '/':
                    IO.println("In Division");
                    if (number2 != 0) {
                        double div = number1 / number2;
                        IO.println("Division of " + number1 + " and " + number2 + " is " + div);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    IO.println("Wrong option entered. Please enter any one of the operators (+,-,*,/) to perform Arithmetic operation");
                    break;

            }
            IO.println("Do you continue for more operations?(Yes/No)");
            String value = scan.next();
            if (value.equalsIgnoreCase("Yes")) {
                IO.println("Please give your input to perform any calculations");
                IO.print("Enter Input number 1 : ");
                number1 = scan.nextInt();
                IO.print("Enter Input number 2 : ");
                number2 = scan.nextInt();
                menu();
                input = scan.next().charAt(0);
                choice = true;
            } else {
                choice = false;
                IO.println("Exiting the Calculator application. Thank you !!!!");
            }
        }
    }

    static void menu() {
        IO.println("Please select the below choice of operation(+,-,*,/) which you want to perform for your input entered.");
        IO.println("+ Addition");
        IO.println("- Subtraction");
        IO.println("* Multiplication");
        IO.println("/ Division");
    }
}

