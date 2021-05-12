package com.company;

import javax.swing.*;
import java.awt.*;

public class TodoInputFields extends JPanel {
    JTextField textField;
    JButton addbutton;
    TodoInputFields() {
        init();
        buildUI();
    }

    void init() {
//        layout
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        textField = new JTextField(30);
        addbutton = new JButton("Add");

        add(textField);
        add(addbutton);
    }
}
