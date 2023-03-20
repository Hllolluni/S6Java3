package com.eutraining.llolluni.s6java3.guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JLabel label1;
    private JTextField textField1;

    public Form1() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 500));
        setContentPane(panel1);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Hello Kosovo students!");
            }
        });
    }

    public static void main(String[] args) {
        new Form1();
    }
}
