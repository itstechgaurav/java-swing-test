package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    final int WIDTH = 400;
    final int HEIGHT = 600;

    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    App() {
        super("To-do App");
        init();
        buildUI();
        setVisible(true);

    }

    void init() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(dimensions);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    void buildUI() {

    }

}
