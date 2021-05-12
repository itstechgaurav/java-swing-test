package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    final int WIDTH = 500;
    final int HEIGHT = 600;

    final Dimension dimensions = new Dimension(WIDTH, HEIGHT);

    JLabel appTitle;
    TodoInputFields inputFields;
    Todos todos;

     App() {
        super("To-do App");
        init();
        buildUI();
        setVisible(true);
    }

    void init() {
//        BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(new FlowLayout(FlowLayout.CENTER));
//      | title - complete
//      | inputFields - panel - complete
//      | Todos - panel
//
        setSize(dimensions);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setResizable(false);
    }

    void buildUI() {
        // add app title
        appTitle = new JLabel("To-Do App");
        appTitle.setFont(new Font("Verdana", Font.BOLD, 25));
        appTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(appTitle);

        // add input fields

        inputFields = new TodoInputFields(this); // panel
        add(inputFields);

        // add todos

        todos = new Todos();
        add(todos);
    }

    public void addTodo(String todo_name) {
         todos.addTodo(todo_name);
    }

}
