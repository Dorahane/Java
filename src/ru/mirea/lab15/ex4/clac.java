package ru.mirea.lab15.ex4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


class LabExample extends JFrame {
    JTextField res = new JTextField();
    JButton[] numberButtons = new JButton[10];
    JButton dotButton = new JButton(".");
    JButton addButton = new JButton("+");
    JButton subButton = new JButton("-");
    JButton multButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton resButton = new JButton("=");
    JPanel pnl = new JPanel(new GridLayout(2,1));
    JPanel panel = new JPanel(new GridLayout(4, 4, 30, 10));
    LabExample() {
        super("Calculator");
        setLayout(new FlowLayout());
        res.setEditable(false); // чтобы поле не редактировалось
        res.setHorizontalAlignment(JTextField.CENTER);
        pnl.add(res,BorderLayout.CENTER);
        res.setPreferredSize(new Dimension(400, 100));
        for (int i = 0; i < 10; i++) {
            int index = i;
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        res.setText(res.getText() + String.valueOf(index));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    }
                }
            });
        }
        panel.add(dotButton);
        dotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + ".");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
        panel.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "+");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
        panel.add(subButton);
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "-");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
        panel.add(multButton);
        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "*");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
        panel.add(divButton);
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "/");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
        panel.add(resButton);
        resButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    String input = res.getText();
                    String[] parts = input.split("(?<=[-+*/])|(?=[-+*/])");
                    List<Double> numbers = new ArrayList<>();
                    List<String> operators = new ArrayList<>();
                    for (String part : parts) { // определяем является символ оператором или числом
                        if (part.matches("[0-9.]+")) {
                            double temp = Double.parseDouble(part);
                            numbers.add(temp);
                        } else {
                            operators.add(part);
                        }
                    }
                    // сначала происходит вычисление * и /
                    for (int i = 0; i < operators.size(); i++) {
                        String operator = operators.get(i);
                        if (operator.equals("*") || operator.equals("/")) {
                            double a = numbers.get(i);
                            double b = numbers.get(i + 1);
                            double result = operator.equals("*") ? a * b : a / b;
                            numbers.set(i, result); // заменяем a и b на результат умнож/деления
                            numbers.remove(i + 1);
                            operators.remove(i); // убираем оператор из списка
                            i--; // тк список уменьшился, то уменьшаем индекс
                        }
                    }
                    double finalResult = numbers.get(0);
                    for (int i = 0; i < operators.size(); i++) {
                        String operator = operators.get(i);
                        double nextNumber = numbers.get(i + 1);
                        if (operator.equals("+")) {
                            finalResult += nextNumber;
                        } else if (operator.equals("-")) {
                            finalResult -= nextNumber;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Result = " + finalResult, "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
        pnl.add(panel,BorderLayout.CENTER);
        add(pnl);
        setSize(500, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabExample();
    }
}