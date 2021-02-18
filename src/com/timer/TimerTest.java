package com.timer;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiFunction;
import javax.swing.*;
import javax.swing.Timer;
// to resolve conflict with java.util.Timer

public class TimerTest
{
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener
        // once every 10 seconds
        Timer t = new Timer(5000,listener);

        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}

class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
