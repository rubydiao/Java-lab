
package z;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class lab10_solar extends JFrame {

    star sun = new star();

    lab10_solar() {
        add(sun);
    }

    class star extends JPanel {

        private Timer timer = new Timer(10, new act());
        int ran2 = 1, ran3 = 1, ran4 = 1, ran5 = 1, ran6 = 1, ran7 = 1, ran8 = 1, ran9 = 1;

        star() {
            timer.start();
        }

        public class act implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent ae) {
                repaint();
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.red);
            int xc = getWidth() / 2;
            int yc = getHeight() / 2;
            g.fillOval(xc - 100, yc - 100, 200, 200);
            g.setColor(Color.decode("#A52A2A"));
            double x2 = xc + 150 * Math.sin(Math.toRadians(ran2));
            double y2 = yc + 150 * Math.cos(Math.toRadians(ran2));
            g.fillOval((int) x2 - (25 / 2), (int) y2 - (25 / 2), 25, 25);
            ran2 = ran2 + 1;
            g.setColor(Color.decode("#736AFF"));
            double x3 = xc + 185 * Math.sin(Math.toRadians(ran3));
            double y3 = yc + 185 * Math.cos(Math.toRadians(ran3));
            g.fillOval((int) x3 - (25 / 2), (int) y3 - (25 / 2), 25, 25);
            ran3 = ran3 + 2;
            g.setColor(Color.decode("#3EA99F"));
            double x4 = xc + 220 * Math.sin(Math.toRadians(ran4));
            double y4 = yc + 220 * Math.cos(Math.toRadians(ran4));
            g.fillOval((int) x4 - (25 / 2), (int) y4 - (25 / 2), 25, 25);
            ran4 = ran4 + 3;
            g.setColor(Color.decode("#C11B17"));
            double x5 = xc + 255 * Math.sin(Math.toRadians(ran5));
            double y5 = yc + 255 * Math.cos(Math.toRadians(ran5));
            g.fillOval((int) x5 - (25 / 2), (int) y5 - (25 / 2), 25, 25);
            ran5 = ran5 + 4;
            g.setColor(Color.decode("#EE9A4D"));
            double x6 = xc + 290 * Math.sin(Math.toRadians(ran6));
            double y6 = yc + 290 * Math.cos(Math.toRadians(ran6));
            g.fillOval((int) x6 - (25 / 2), (int) y6 - (25 / 2), 25, 25);
            ran6 = ran6 + 5;
            g.setColor(Color.decode("#806517"));
            double x7 = xc + 325 * Math.sin(Math.toRadians(ran7));
            double y7 = yc + 325 * Math.cos(Math.toRadians(ran7));
            g.fillOval((int) x7 - (25 / 2), (int) y7 - (25 / 2), 25, 25);
            ran7 = ran7 + 6;
            g.setColor(Color.decode("#77BFC7"));
            double x8 = xc + 360 * Math.sin(Math.toRadians(ran8));
            double y8 = yc + 360 * Math.cos(Math.toRadians(ran8));
            g.fillOval((int) x8 - (25 / 2), (int) y8 - (25 / 2), 25, 25);
            ran8 = ran8 + 7;
            g.setColor(Color.decode("#43BFC7"));
            double x9 = xc + 395 * Math.sin(Math.toRadians(ran9));
            double y9 = yc + 395 * Math.cos(Math.toRadians(ran9));
            g.fillOval((int) x9 - (25 / 2), (int) y9 - (25 / 2), 25, 25);
            ran9 = ran9 + 8;
        }
    }

    public static void main(String[] args) {
        lab10_solar sl = new lab10_solar();
        sl.setSize(1000, 1000);
        sl.setVisible(true);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
