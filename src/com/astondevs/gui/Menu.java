package com.astondevs.gui;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame {
    public JButton task1;
    public JButton task2;
    public JButton task3;


    public void addTask1ActionListener() {
        this.task1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int number;
                try {
                    number = Integer.parseInt(JOptionPane.showInputDialog("Введите число: "));
                    if (number > 7) {
                        JOptionPane.showMessageDialog(Menu.this,
                                "Привет");
                    }else if(number == 7) {
                        JOptionPane.showMessageDialog(Menu.this,
                                "Введенное число равно 7");
                    }else {
                        JOptionPane.showMessageDialog(Menu.this,
                                "Введенное число меньше 7");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Menu.this,
                            "Введенные данные не являются числом");
                }
            }
        });
    }


    public void addTask2ActionListener() {
        this.task2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name;
                JFrame frame_menu = new JFrame();
                frame_menu.setSize(250,250);
                try {
                name =  JOptionPane.showInputDialog("Введите имя: ");
                if (name.equals("Вячеслав")) {
                    JOptionPane.showMessageDialog(Menu.this,
                            "Привет, " + name);
                } else {
                    JOptionPane.showMessageDialog(Menu.this,
                            "Нет такого имени");
                }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(Menu.this,
                            "Отмена ввода имени");
                }

            }
        });
    }

    public void addTask3ActionListener() {
        this.task3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int[] array = new int[5];
                JFrame frame_menu = new JFrame();
                frame_menu.setSize(250,250);
                JOptionPane.showMessageDialog(Menu.this,
                        "В данный масив нужно ввести 5 разных чисел, после чего выведутся числа кратные 3");
                try {
                    for (int i = 0; i < array.length; i++) {
                        array[i] = Integer.parseInt(JOptionPane.showInputDialog
                                ("Введите число для добавления в массив: "));
                    }
                    ArrayList<Integer> result = new ArrayList<>();
                    for (int var : array) {
                        if (var % 3 == 0) {
                            result.add(var);
                        }
                    }
                    JOptionPane.showMessageDialog(Menu.this,
                            "Элементы массива кратные 3:  " + result);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Menu.this,
                            "Введенные данные не являются числом");
                }

            }
        });
    }
}