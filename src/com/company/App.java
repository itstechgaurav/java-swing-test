package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    final int WIDTH = 400;
    final int HEIGHT = 400;


    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    JButton btn;
    JButton btn2;

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
        add(btn);
        add(btn2);

        btn.addActionListener(this);
        btn2.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn_clicked = (JButton) e.getSource();
        if(btn_clicked.equals(btn)) {
            System.out.println("Button 1");
        } else {
            System.out.println("Button 2");
        }
    }
}
