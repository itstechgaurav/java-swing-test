package com.company;

import javax.swing.*;
import java.awt.*;

public class Todo extends JPanel {
    String todo_inner_text;
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

    public void create(String todo_name) {
        todo_inner_text = todo_name;
        todo_text = new JLabel(todo_name);
        todo_complete = new JButton("Mark as complete");
        todo_delete = new JButton("Delete");

        add(todo_text);
        add(todo_complete);
        add(todo_delete);

        todo_complete.addActionListener(e -> { complete(); });
        todo_delete.addActionListener(e -> { delete(); });
    }

    public void complete() {
        if(todo_complete.getText().equals("Mark as complete")) {
            todo_text.setText("<html><strike>" + todo_inner_text + "</strike></html>");
            todo_complete.setText("Mark as incomplete");
        } else {
            todo_text.setText(todo_inner_text);
            todo_complete.setText("Mark as complete");
        }
    }

    public void delete(){
        parent.remove(this);
    }
}
