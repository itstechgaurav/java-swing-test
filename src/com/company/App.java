package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    final int WIDTH = 400;
    final int HEIGHT = 600;

    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    JLabel appTitle;

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
        // add app title
        appTitle = new JLabel("To-Do App");
        appTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        add(appTitle);

    }

}
