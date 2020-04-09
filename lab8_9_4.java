package z;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import javax.swing.Timer;

public class lab8_9_4 extends JFrame {

    private JButton jbt1 = new JButton("Enlarge");
    private JButton jbt2 = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    lab8_9_4() {
        JPanel panel = new JPanel();
        panel.add(jbt1);
        panel.add(jbt2);
        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
        jbt1.addActionListener(new Listener());
        jbt2.addActionListener(new Listener1());

    }

    class CirclePanel extends JPanel {
        int r = 5;
        CirclePanel() {

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(getWidth() / 2 - r, getHeight() / 2 - r, 2 * r, 2 * r);
        }
        public void enlarge(){
            r++;
            repaint();
        }
        public void Shrink(){
            r--;
            repaint();
        }
    }

    public static void main(String[] args) {
        lab8_9_4 frame = new lab8_9_4();
        frame.setTitle("week8_9");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.enlarge();
            
        }
    }
    class Listener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.Shrink();
            
        }
    }

}