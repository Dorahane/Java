package ru.mirea.lab16.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class game extends JFrame {
    JTextField num = new JTextField(10);
    JButton gBut = new JButton("Угадать");
    JLabel mes = new JLabel("Угадайте число от 0 до 20 (3 попытки).");
    JPanel pnl = new JPanel(new GridLayout(3,1,0,30));
    private int guessNum;
    private int attempts;
    game(){
        setTitle("Игра-Угадайка");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        guessNum = new Random().nextInt(21);
        attempts = 0;
        setLayout(new FlowLayout());
        num.setHorizontalAlignment(JTextField.CENTER);
        pnl.add(mes);
        pnl.add(num);
        pnl.add(gBut);
        gBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int finNum = Integer.parseInt(num.getText());
                    attempts++;

                    if (finNum < 0 || finNum > 20) {
                        mes.setText("Введите число от 0 до 20!");
                        return;
                    }

                    if (finNum == guessNum) {
                        JOptionPane.showMessageDialog(null, "Вы угадали! Загаданное число было: " + guessNum);
                        System.exit(0);
                    } else if (attempts >= 3) {
                        JOptionPane.showMessageDialog(null, "Игра окончена, вы не угадали. Загаданное число было: " + guessNum);
                        System.exit(0);
                    } else {
                        mes.setText(finNum < guessNum ?
                                "Слишком маленькое число! У вас осталось попыток: " + (3 - attempts) :
                                "Слишком большое число! У вас осталось попыток: " + (3 - attempts));
                    }
                } catch (Exception e) {
                    mes.setText("Введите корректное число!");
                }
            }
        });
        add(pnl);
        setSize(500, 350);
        setVisible(true);
    }
    public static void main(String[] args) {
        new game();
    }
}
