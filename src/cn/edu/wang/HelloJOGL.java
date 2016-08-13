package cn.edu.wang;

import javax.media.opengl.*;
import javax.swing.*;
import java.awt.*;


/**
 * Created by Joe Wang, tbpwang@gmail.com
 * 2016/5/26.
 */
public class HelloJOGL extends JFrame implements GLEventListener, Runnable {
    private GL gl;
    private GLCanvas canvas;
    //    private GLCapabilities capabilities;
    private Thread thread = new Thread();


    public static void main(String[] args) {
        HelloJOGL helloJOGL = new HelloJOGL();
        helloJOGL.setTitle("JOGL test!");
        helloJOGL.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        helloJOGL.setSize(500, 300);
        helloJOGL.setVisible(true);
    }
    public HelloJOGL() throws HeadlessException {
        GLCapabilities capabilities = new GLCapabilities();
        this.canvas = new GLCanvas(capabilities);
        this.canvas.addGLEventListener(this);
        //this.canvas.setSize(400, 400);
        this.add(canvas, BorderLayout.CENTER);

        thread.start();

    }

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        gl = glAutoDrawable.getGL();
        gl.glClearColor(0.9f, 0.9f, 0.0f, 1.0f);
    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glRectf(30, 30, 130, 90);
        gl.glFlush();
        this.canvas.swapBuffers();
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {
        gl.glViewport(0, 0, i2, i3);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(0, 200, 0, 200, 1, -1);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    @Override
    public void displayChanged(GLAutoDrawable glAutoDrawable, boolean b, boolean b1) {
    }

    @Override
    public void run() {
        do {
            this.canvas.display();
            try {
                thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
