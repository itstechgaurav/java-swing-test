package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    final int WIDTH = 400;
    final int HEIGHT = 400;


    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    JButton btn;
    JButton btn2;

    JTextField field;

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
        setResizable(false);
    }

    void buildUI() {
        btn = new JButton("Button 1");
        label = new JLabel("label");
        field = new JTextField(22);
        add(field);
        add(btn);
        add(label);


        btn.addActionListener((e) ->{
            label.setText(field.getText());
        });
    }

}