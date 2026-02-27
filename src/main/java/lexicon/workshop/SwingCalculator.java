package lexicon.workshop;

import javax.swing.*;

public class SwingCalculator {

    static void main(String[] args) {

        //Set the frame
        JFrame frame = new JFrame("Basic Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);

        //Designing the required fields and buttons for the calculator app
        JLabel lable1 = new JLabel("Enter Input 1 : ");
        JLabel lable2 = new JLabel("Enter Input 2 : ");
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        JButton calcBtn = new JButton("Calculate");
        JLabel result = new JLabel("Output of the Calculation :");

        //Setting the boundary size
        lable1.setBounds(50, 30, 150, 25);
        input1.setBounds(150, 30, 120, 25);
        lable2.setBounds(50, 70, 150, 25);
        input2.setBounds(150, 70, 120, 25);
        calcBtn.setBounds(100, 150, 150, 30);
        result.setBounds(100, 200, 250, 30);

        // Operation dropdown
        String[] operations = { "Add", "Subtract", "Multiply", "Divide", "Power" };
        JComboBox<String> operationBox = new JComboBox<>(operations);
        operationBox.setBounds(100, 110, 150, 30);

        //Action for the dropdown choosed
        calcBtn.addActionListener(e -> {

            try {
                double n1 = Double.parseDouble(input1.getText());
                double n2 = Double.parseDouble(input2.getText());

                String choice = (String) operationBox.getSelectedItem();
                double output = 0;

                switch (choice) {
                    case "Add":
                        output = n1 + n2;
                        break;

                    case "Subtract":
                        output = n1 - n2;
                        break;

                    case "Multiply":
                        output = n1 * n2;
                        break;

                    case "Divide":
                        if (n2 == 0)
                            throw new ArithmeticException("Cannot divide by Zero");
                        output = n1 / n2;
                        break;

                    case "Power":
                        output = Math.pow(n1, n2);
                        break;
                }

                result.setText("Output of the Calculation : " + output);

            } catch (NumberFormatException ex) {
                result.setText("Invalid number entered");
            } catch (ArithmeticException ex) {
                result.setText(ex.getMessage());
            }
        });

        frame.add(lable1);
        frame.add(input1);
        frame.add(lable2);
        frame.add(input2);
        frame.add(operationBox);
        frame.add(calcBtn);
        frame.add(result);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
