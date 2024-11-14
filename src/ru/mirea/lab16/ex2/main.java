package ru.mirea.lab16.ex2;

import javax.swing.*;
import java.awt.*;

class editor extends JFrame {
    JTextArea textArea = new JTextArea();
    JMenuBar menuBar = new JMenuBar();
    JMenu colorMenu = new JMenu("Цвет");
    JMenu fontMenu = new JMenu("Шрифт");
    JMenuItem blue = new JMenuItem("Синий");
    JMenuItem red = new JMenuItem("Красный");
    JMenuItem black = new JMenuItem("Черный");
    JMenuItem timesNewRoman = new JMenuItem("Times New Roman");
    JMenuItem msSansSerif = new JMenuItem("MS Sans Serif");
    JMenuItem courierNew = new JMenuItem("Courier New");

    public editor() {
        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new JScrollPane(textArea));
        colorMenu.add(blue);
        colorMenu.add(red);
        colorMenu.add(black);
        menuBar.add(colorMenu);
        fontMenu.add(timesNewRoman);
        fontMenu.add(msSansSerif);
        fontMenu.add(courierNew);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);
        blue.addActionListener(e -> textArea.setForeground(Color.BLUE));
        red.addActionListener(e -> textArea.setForeground(Color.RED));
        black.addActionListener(e -> textArea.setForeground(Color.BLACK));
        timesNewRoman.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)));
        msSansSerif.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14)));
        courierNew.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14)));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            editor editor = new editor();
            editor.setVisible(true);
        });
    }
}
