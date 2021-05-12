package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TodoInputFields extends JPanel {
    JTextField textField;
    JButton addbutton;
    App parent;

    TodoInputFields(App parent) {
        this.parent = parent;
        init();
        buildUI();
    }

    void init() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        textField = new JTextField(30);
        addbutton = new JButton("Add");

        add(textField);
        add(addbutton);

        addbutton.addActionListener(e -> {
            parent.todos.addTodo(textField.getText());
        });
    }
}
