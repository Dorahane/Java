package ru.mirea.lab5;

import javax.swing.*;

public class ex1 {
    private int milanScore = 0;
    private int madridScore = 0;

    private JFrame frame;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public ex1() {
        frame = new JFrame("Match Result Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);


        JButton acMilanButton = new JButton("AC Milan");
        acMilanButton.setBounds(50, 50, 100, 30);
        acMilanButton.addActionListener(e -> updateScore("milan"));

        // Кнопка для Real Madrid
        JButton realMadridButton = new JButton("Real Madrid");
        realMadridButton.setBounds(150, 50, 100, 30);
        realMadridButton.addActionListener(e -> updateScore("madrid"));

        // Надпись для результата
        resultLabel = new JLabel("Result: 0 X 0");
        resultLabel.setBounds(100, 10, 150, 30);

        // Надпись для последнего забившего
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        lastScorerLabel.setBounds(100, 90, 150, 30);

        // Надпись для победителя
        winnerLabel = new JLabel("Winner: DRAW");
        winnerLabel.setBounds(100, 130, 150, 30);

        // Добавляем компоненты на фрейм
        frame.add(acMilanButton);
        frame.add(realMadridButton);
        frame.add(resultLabel);
        frame.add(lastScorerLabel);
        frame.add(winnerLabel);

        // Делаем фрейм видимым
        frame.setVisible(true);
    }

    private void updateScore(String team) {
        if (team.equals("milan")) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }
        updateResult();
    }

    private void updateResult() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        updateWinner();
    }

    private void updateWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new ex1();
    }
}