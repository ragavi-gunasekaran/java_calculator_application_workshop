package lexicon.workshop;

import javax.swing.*;

public class SwingCalculator {

    static void main(String[] args) {

        JFrame frame = new JFrame("Advanced Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton addBtn = new JButton("Add");
        JLabel result = new JLabel("Result:");

        frame.setLayout(null);

        num1.setBounds(50, 30, 150, 30);
        num2.setBounds(50, 70, 150, 30);
        addBtn.setBounds(50, 110, 150, 30);
        result.setBounds(50, 150, 200, 30);

        addBtn.addActionListener(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText("Result: " + (a + b));
            } catch (Exception ex) {
                result.setText("Please enter valid input");
            }
        });

        frame.add(num1);
        frame.add(num2);
        frame.add(addBtn);
        frame.add(result);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
