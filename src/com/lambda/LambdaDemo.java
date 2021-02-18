package com.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class LambdaDemo {
    public static void main(String[] args) throws InterruptedException {
        //main start
        repeatMessage("Hello",5000);
        //main doing
        //Thread.sleep(30000);
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
        //main exec
    }
    public static void repeatMessage(String text, int delay){
        ActionListener listener = event ->
        {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay,listener).start();

    }
}
