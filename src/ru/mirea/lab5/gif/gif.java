package ru.mirea.lab5.gif;

import javax.swing.*;
import java.awt.*;

public class gif {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("Gifka");
                frame.setSize(230, 205);
                JLabel jLabel = new JLabel();
                Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\hp\\IdeaProjects\\JavaForVuza\\src\\ru\\mirea\\lab5\\gif\\cat.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                imageIcon.setImageObserver(jLabel);
                jLabel.setIcon(imageIcon);
                frame.add(jLabel);
                frame.setVisible(true);
            }
        });
    }
}