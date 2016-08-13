package cn.edu.wang;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Joe Wang, tbpwang@gmail.com
 * 2016/5/26.
 */
public class HelloWWApplet extends JApplet {
    public HelloWWApplet() throws HeadlessException {
        JLabel label1 = new JLabel();
        JLabel label2 =  new JLabel();
        label1.setText("Hello, world wind");
        label2.setText("Welcome to our world wind!");
        this.getContentPane().add(label1, BorderLayout.EAST);
        this.getContentPane().add(label2, BorderLayout.WEST);
    }
}
