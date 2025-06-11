package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import logic.ColorChangeEvent;

public class ColorWindow extends JFrame {
    public ColorWindow() {
        setTitle("AspectJ Observer GUI");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton redBtn = new JButton("Rojo");
        JButton greenBtn = new JButton("Verde");
        JButton blueBtn = new JButton("Azul");

        redBtn.addActionListener((ActionEvent e) -> {
            getContentPane().setBackground(Color.RED);
            new ColorChangeEvent("Rojo");
        });

        greenBtn.addActionListener((ActionEvent e) -> {
            getContentPane().setBackground(Color.GREEN);
            new ColorChangeEvent("Verde");
        });

        blueBtn.addActionListener((ActionEvent e) -> {
            getContentPane().setBackground(Color.BLUE);
            new ColorChangeEvent("Azul");
        });

        add(redBtn);
        add(greenBtn);
        add(blueBtn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorWindow();
    }
}
