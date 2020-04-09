
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.*;
import javax.swing.JButton;
import javax.xml.bind.Marshaller.Listener;

public class LAB_fan extends JFrame {

    private int xBase = 0, speed;
    private JButton jbt0 = new JButton("0");
    private JButton jbt1 = new JButton("1");
    private JButton jbt2 = new JButton("2");
    private JButton jbt3 = new JButton("3");
    private Timer timer = new Timer(5, new TimerListener());

    public LAB_fan() {
        JPanel jpnt1 = new JPanel(new GridLayout(1, 1));
        setTitle("DrawArcs");
        jpnt1.add(new ArcsPanel());


        JPanel jpt = new JPanel(new GridLayout(1, 4));
        jpt.add(jbt0);
        jbt0.addActionListener(new ButtonListener());
        jpt.add(jbt1);
        jbt1.addActionListener(new ButtonListener());
        jpt.add(jbt2);
        jbt2.addActionListener(new ButtonListener());
        jpt.add(jbt3);
        jbt3.addActionListener(new ButtonListener());
        add(jpnt1, BorderLayout.CENTER);
        add(jpt, BorderLayout.SOUTH);
        timer.start();

    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbt0) {
                speed = 0;
            }
            if (e.getSource() == jbt1) {
                speed = 1;
            }
            if (e.getSource() == jbt2) {
                speed = 2;
            }
            if (e.getSource() == jbt3) {
                speed = 5;
            }
        }

    }

    public static void main(String[] args) {
        LAB_fan frame = new LAB_fan();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 200);
        frame.setVisible(true);
    }

// The class for drawing arcs on a panel
    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            xBase += speed;
            repaint();
        }

    }

    class ArcsPanel extends JPanel {

        int i;
        int o;
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int xCenter = getWidth() / 2;
            int yCenter = getHeight() / 2;
            int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
            int x = xCenter - radius;
            int y = yCenter - radius;
            i--;
            g.fillArc(x, y, 2 * radius, 2 * radius, 0 + i * speed, 30);
            g.fillArc(x, y, 2 * radius, 2 * radius, 90 + i * speed, 30);
            g.fillArc(x, y, 2 * radius, 2 * radius, 180 + i * speed, 30);
            g.fillArc(x, y, 2 * radius, 2 * radius, 270 + i * speed, 30);
        }
    }
}
