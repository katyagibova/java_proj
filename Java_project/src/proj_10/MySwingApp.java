package proj_10;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class MySwingApp extends JFrame {
    private int clickCount = 0;
    public MySwingApp() {
        setTitle("Simple calculator");
        setSize(600, 500);
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton split = new JButton("/");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JLabel answer = new JLabel();
        JLabel numA=new JLabel();
        JLabel numB=new JLabel();
        JLabel result=new JLabel();
        add(num1);
        add(num2);
        add(answer);
        add(plus);
        add(minus);
        add(multiply);
        add(split);
        add(numA);
        add(numB);
        add(result);

        answer.setForeground(Color.MAGENTA);
        answer.setBorder(new CompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.CYAN), BorderFactory.createEmptyBorder()));
        numA.setForeground(Color.magenta);
        numB.setForeground(Color.magenta);
        result.setForeground(Color.magenta);
        numA.setText("Number A");
        numB.setText("Number B");
        result.setText("result");
        num1.setBounds(120, 50, 100, 50);
        num2.setBounds(380, 50, 100, 50);
        answer.setBounds(150, 282, 300, 50);
        plus.setBounds(120, 180, 50, 50);
        minus.setBounds(225, 180, 50, 50);
        multiply.setBounds(325, 180, 50, 50);
        split.setBounds(430, 180, 50, 50);
        numA.setBounds(162,25,70,10);
        numB.setBounds(425,25,70,10);
        result.setBounds(280,260,80,15);
        num1.setHorizontalAlignment(SwingUtilities.RIGHT);
        num2.setHorizontalAlignment(SwingUtilities.RIGHT);
        answer.setHorizontalAlignment(SwingUtilities.LEFT);

        minus.addActionListener(action -> {
            try {
                answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText())));
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });

        plus.addActionListener(action -> {
            try {
                answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });

        split.addActionListener(action -> {
            try {
                if (Double.parseDouble(num2.getText())==0)
                {
                    answer.setText("Error");
                    JOptionPane.showMessageDialog(null, "It is impossible");
                }
                else
                    answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });

        multiply.addActionListener(action -> {
            try {
                answer.setText(String.format("%.4f", Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect input");
            }
        });
    }
}
