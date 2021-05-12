package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Todos extends JPanel {
    JLabel title;
    ArrayList<Todo> my_todos;

    Todos() {
        init();
        buildUI();
    }

    void init() {
        my_todos = new ArrayList<Todo>();
        setPreferredSize(new Dimension(450, 400));
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        title = new JLabel("Todos:");
        add(title);
    }

    public void addTodo(String todo_name) {
        System.out.println(todo_name);
        Todo newTodo = new Todo(this);
        newTodo.create(todo_name);

        my_todos.add(newTodo);
        add(newTodo);

        // revalidate and repaint
        revalidate();
        repaint();
    }
}
