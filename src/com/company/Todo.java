package com.company;

import javax.swing.*;
import java.awt.*;

public class Todo extends JPanel {
    JLabel todo_text;
    JButton todo_complete, todo_delete;
    Todos parent;

    Todo(Todos parent) {
        this.parent = parent;
        init();
    }

    void init() {
        setOpaque(true);
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(450, 100));
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public void buildUI(String todo_name) {
        todo_text = new JLabel(todo_name);
        todo_complete = new JButton("Mark as complete");
        todo_delete = new JButton("Delete");

        add(todo_text);
        add(todo_complete);
        add(todo_delete);

        System.out.println("From build ui");
    }
}
