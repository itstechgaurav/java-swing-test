package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    final int WIDTH = 400;
    final int HEIGHT = 400;


    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    JButton btn;
    JButton btn2;

    JLabel label;

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
        btn = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        label = new JLabel("label");
        add(btn);
        add(btn2);
        add(label);
        btn.addActionListener((e) ->{
            label.setText(btn.getText());
        });
        btn2.addActionListener((e) ->{
            label.setText(btn2.getText());
        });
    }

}
