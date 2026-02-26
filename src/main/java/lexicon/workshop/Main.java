package lexicon.workshop;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static void main() {

        // To get console based input from the user

        IO.println("********* Welcome to Calculator Application *********");

        menu();
        char input = scan.next().charAt(0);
        boolean choice = true;

        while (choice) {
            switch (input) {
                case '+':
                    IO.println("In Addition");
                    IO.println("Do you want to add more than 2 operants?(Yes/No)");
                    String option1 = scan.next();
                    if (option1.equalsIgnoreCase("Yes")) {
                        IO.println("Please enter how many numbers you want to add ? ");
                        int index = scan.nextInt();
                        double[] add = new  double[index];
                        for(int i = 0; i < index;i++){
                            IO.print("Enter Input number " + (i+1) + " : ");
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
                        double[] sub = new  double[index];
                        for(int i = 0; i < index;i++){
                            IO.print("Enter Input number " + (i+1) + " : ");
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
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    IO.println("Wrong option entered. Please enter any one of the operators (+,-,*,/) to perform Arithmetic operation");
                    break;

            }
            IO.println("Do you continue for more operations?(Yes/No)");
            String value = scan.next();
            if (value.equalsIgnoreCase("Yes")) {
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

//    static int inputValues(){
//        IO.println("Please give your input to perform any calculations");
//        IO.print("Enter Input number 1 : ");
//        int number1 = scan.nextInt();
//        IO.print("Enter Input number 2 : ");
//        int number2 = scan.nextInt();
//
//    }
}

