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
        setMinimumSize(new Dimension(500, 100));
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        title = new JLabel("Todos:");
        add(title);
    }
}
