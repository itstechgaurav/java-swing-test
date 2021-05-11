package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    final int WIDTH = 400;
    final int HEIGHT = 400;
    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    App() {
        super("First love");
        init();
    }

    void init() {
//        initial code
        setVisible(true);
        setSize(dimensions);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
