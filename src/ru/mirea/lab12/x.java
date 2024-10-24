package ru.mirea.lab12;

import javax.swing.*;
import java.awt.*;
class x extends JFrame{
    JPanel[] pnl = new JPanel[9];
    public x() {
        setLayout(new GridLayout(3,3));
        for(int i = 0 ; i < pnl.length ; i++){
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);
        pnl[8].setLayout(new FlowLayout());
        pnl[8].add(new JButton("one"));
        pnl[8].add(new JButton("two"));
        pnl[8].add(new JButton("three"));
        pnl[8].add(new JButton("four"));
        pnl[8].add(new JButton("five"));
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new x().setVisible(true);
    }
}