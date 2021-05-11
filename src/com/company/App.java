package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    final int WIDTH = 400;
    final int HEIGHT = 400;

    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    App() {
        super("First love my bora");
        init();
        buildUI();
    }

    void init() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
//        initial code
        setVisible(true);
        setSize(dimensions);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void buildUI() {
        JButton btn = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        add(btn);
        add(btn2);

    }
}
