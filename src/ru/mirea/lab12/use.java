package ru.mirea.lab12;

import javax.swing.*;
import java.awt.*;


class use extends JFrame{
    private int milanScore = 0;
    private int madridScore = 0;

    private JFrame frame;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;
    private JLabel gifLabel;
    JPanel[] pnl = new JPanel[9];

    public use() {
        frame = new JFrame("Match Result Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3));

        setLayout(new GridLayout(3,3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        // Инициализация кнопок
        JButton acMilanButton = new JButton("AC Milan");
        acMilanButton.addActionListener(e -> updateScore("milan"));

        JButton realMadridButton = new JButton("Real Madrid");
        realMadridButton.addActionListener(e -> updateScore("madrid"));

        // Инициализация надписей
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(resultLabel, BorderLayout.NORTH);
        pnl[4].add(lastScorerLabel, BorderLayout.CENTER);
        pnl[4].add(winnerLabel, BorderLayout.SOUTH);
        pnl[3].setLayout(new BorderLayout());
        pnl[5].setLayout(new BorderLayout());
        pnl[3].add(acMilanButton, BorderLayout.EAST);
        pnl[5].add(realMadridButton, BorderLayout.WEST);

        gifLabel = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\hp\\IdeaProjects\\JavaForVuza\\src\\ru\\mirea\\lab5\\gif\\cat.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        gifLabel.setIcon(imageIcon);
        pnl[1].add(gifLabel);
        setSize(800,500);
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
        new use().setVisible(true);
    }
}
