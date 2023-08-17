package krit1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Stack;

public class Form1 extends JFrame implements ActionListener, KeyListener {

    JTextArea t;
    JButton b1;
    JButton b2;
    Stack<String> X = new Stack<String>();
    Stack<String> XY = new Stack<String>();

    public Form1() {

        Container cp = this.getContentPane();
        cp.setLayout(null);

        t = new JTextArea();
        b1 = new JButton("UNDO");
        b2 = new JButton("REDO");
        t.setBounds(10, 10, 160, 80);
        b1.setBounds(10, 110, 70, 40);
        b2.setBounds(100, 110, 70, 40);

        cp.add(t);
        cp.add(b1);
        cp.add(b2);

        t.addKeyListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(200, 200);
        ;
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            if (!X.isEmpty()) {
                XY.push(X.pop());
                if (!X.isEmpty()) {
                    t.setText(X.peek());
                } else
                    t.setText("");
            }
        }

        if (e.getSource() == b2 && !XY.isEmpty()) {
            X.push(XY.pop());
            t.setText(X.peek());
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER
                || e.getKeyCode() == KeyEvent.VK_SPACE) {
            X.push(t.getText());
            if (!XY.isEmpty())
                XY.clear();
        }
    }
}
