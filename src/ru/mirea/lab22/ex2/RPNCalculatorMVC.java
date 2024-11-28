package ru.mirea.lab22.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

class RPNCalculatorMVC extends JFrame {
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
    RPNCalculatorMVC() {
        super("Calculator");
        Stack<Double> stack = new Stack<>();
        setLayout(new FlowLayout());
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
                try{
                    boolean fun = false;
                    while (!fun) {
                        String input = res.getText();
                        String[] tokens = input.split("");
                        for (String token : tokens) {
                            switch (token) {
                                case "+":
                                    try {
                                        stack.push(stack.pop() + stack.pop());
                                        fun = true;
                                        break;
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                case "-":
                                    try {
                                        double b = stack.pop();
                                        double a = stack.pop();
                                        stack.push(a - b);
                                        fun = true;
                                        break;
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                case "*":
                                    try {
                                        stack.push(stack.pop() * stack.pop());
                                        fun = true;
                                        break;
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                case "/":
                                    try {
                                        double b = stack.pop();
                                        double a = stack.pop();
                                        if (b == 0) {
                                            System.out.println("Деление на 0 невозможно");
                                        }
                                        stack.push(a / b);
                                        fun = true;
                                        break;
                                    } catch (ArithmeticException e) {
                                        System.out.println("Деление на 0 невозможно");
                                    } catch (Exception e) {
                                        System.out.println("Ошибка " + e.getMessage());
                                    }
                                default:
                                    stack.push(Double.parseDouble(token));
                                    break;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Result = " + stack.pop(), "Alert", JOptionPane.INFORMATION_MESSAGE);
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
        new RPNCalculatorMVC();
    }
}