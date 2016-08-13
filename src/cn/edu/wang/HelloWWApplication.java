package cn.edu.wang;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Joe Wang, tbpwang@gmail.com
 * 2016/5/26.
 */
public class HelloWWApplication extends JFrame {
    public HelloWWApplication() throws HeadlessException {
        JLabel labelTop = new JLabel();
        JLabel labelContent = new JLabel();
        labelTop.setText("Hello, World Wind");
        labelContent.setText("Welcome to World Wind!");
        this.getContentPane().add(labelTop, BorderLayout.NORTH);
        this.getContentPane().add(labelContent,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        HelloWWApplication application = new HelloWWApplication();
        application.setTitle("First Program!");
        //application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(300,150);
        application.setVisible(true);
    }

}
