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
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        Insets paddings = new Insets(10, 10, 10, 10);
        textField = new JTextField(30);
        addbutton = new JButton("Add");
        textField.setMargin(paddings);
        addbutton.setMargin(paddings);
        add(textField);
        add(addbutton);

        textField.setToolTipText("Enter the todo name");
    }
}
