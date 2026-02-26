package lexicon.workshop;

import java.util.Scanner;

public class Main {
    static void main() {

        // To get console based input from the user
        Scanner scan = new Scanner(System.in);

        IO.println("Welcome to Calculator Application");
        IO.println("Please give your input to perform any calculations");
        IO.print("Input number 1 : " );
        int number1 = scan.nextInt();
        IO.print("Input number 2 : ");
        int number2 = scan.nextInt();

        IO.println("Please select the below choice of operation which you want to perform for your input entered.");
        IO.println("1. Addition");
        IO.println("2. Subtraction");
        IO.println("3. Multiplication");
        IO.println("4. Division");
        IO.println("0. Exit the app");
        int input = scan.nextInt();

        switch(input) {
            case 1:
                IO.println("In Addition");
                IO.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
                break;
            case 2:
                IO.println("In Subtraction");
                IO.println("Subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
                break;
            case 3:
                IO.println("In Multiplication");
                IO.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
                break;
            case 4:
                IO.println("In Division");
                IO.println("Division of " + number1 + " and " + number2 + " is " + (number1 / number2));
                break;
            case 0:
                IO.println("Exiting the Calculator application. Thank you !!!!");
                break;
            default:
                IO.println("Wrong option entered. Please enter the option number from 1 to 4 to perform Arithmetic operation and 0 to Exit the application");
                break;

        }
    }
    }

