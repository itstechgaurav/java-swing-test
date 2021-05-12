package com.company;

import javax.swing.*;
import java.awt.*;

public class Todos extends JPanel {
    JLabel title;
    Todos() {
        init();
        buildUI();
    }

    void init() {
//        setSize(500, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        title = new JLabel("Todos:");
        title.setPreferredSize(new Dimension(400, 20));
        title.setOpaque(true);
        title.setBackground(Color.blue);
        add(title);
    }
}
