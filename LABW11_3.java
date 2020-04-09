package javaapplication7;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import javax.swing.Timer;

public class LABW11_3 extends JFrame {

    LABW11_3() {
        add(new RaceCar());

    }

    public static void main(String[] args) {
        LABW11_3 frame = new LABW11_3();
        frame.setTitle("RaceCar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

}

class RaceCar extends JPanel {

    private int xBase = 0, speed;

    public RaceCar() {
        Thread timer = new Thread(new Runnable() {
     

        @Override
        public void run() {
            while(true){
                repaint();
             
                
                
                    try{
			Thread.sleep(10);
                    }catch(Exception e){ }  
            }
        }
    });
        
        timer.start();
        
        this.setFocusable(true);

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int yBase = getHeight();
        if (xBase > getWidth()) {
            xBase = -20;
        } else {
            xBase += 1;
        }

        g.setColor(Color.BLACK);
        g.fillOval(xBase + 10, yBase - 10, 10, 10);
        g.fillOval(xBase + 30, yBase - 10, 10, 10);

        g.setColor(Color.MAGENTA);
        g.fillRect(xBase, yBase - 20, 50, 10);
        g.setColor(Color.BLUE);
        Polygon polygon = new Polygon();
        polygon.addPoint(xBase + 10, yBase - 20);
        polygon.addPoint(xBase + 20, yBase - 30);
        polygon.addPoint(xBase + 30, yBase - 30);
        polygon.addPoint(xBase + 40, yBase - 20);
        g.fillPolygon(polygon);
    }
}
