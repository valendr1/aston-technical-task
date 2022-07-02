package com.astondevs.service;

import com.astondevs.gui.Menu;

import javax.swing.*;

public class Application {

    public void run(){
        Menu menu = new Menu();

        JFrame Mainframe = new JFrame();
        JPanel MainPanel = new JPanel();

        Mainframe.setSize(400, 400);
        Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Mainframe.add(MainPanel);
        Mainframe.setTitle("Техническое задание");

        MainPanel.setLayout(null);

        JButton task1button = new JButton("Task 1");
        task1button.setBounds(100, 25, 200, 100);
        JButton task2button = new JButton("Task 2");
        task2button.setBounds(100, 125, 200, 100);
        JButton task3button = new JButton("Task 3");
        task3button.setBounds(100, 225, 200, 100);

        menu.task1 = task1button;
        menu.task2 = task2button;
        menu.task3 = task3button;
        menu.addTask1ActionListener();
        menu.addTask2ActionListener();
        menu.addTask3ActionListener();

        MainPanel.add(task1button);
        MainPanel.add(task2button);
        MainPanel.add(task3button);
        Mainframe.setVisible(true);
    }
}
