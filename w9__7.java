package javaapplication9;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import javax.swing.Timer;

public class w9__7 extends JFrame {

    public w9__7() {
         JPanel panel = new JPanel();
         add(new hang());
    }
    class hang extends JPanel {

       
         private Timer timer = new Timer(1, new TimerListener()); 
         int radius = 20;
         int i = 40 , l = 40;
         int o;
         
         hang() {
            timer.start();
         }
          class TimerListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
               repaint();
            }
          }
          
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawArc(20, 220, 80, 40, 0, 180);
            g.drawLine(20 + 40, 220, 20 + 40, 20);
            g.drawLine(20 + 40, 20, 20 + 40 + 100, 20);//base
            if(160-i==200 || 160+l==120)
                o = 1;
            if(160-i==120 || 160+l==200)
                o = 0;    
            g.drawLine(20 + 40 + 100, 20, 20 + 40 + 100-i, 40); //เชือก

          g.drawOval(20 + 40 + 100 - radius - i, 40, 2 * radius, 2 * radius); // ลูกวงกลม
          g.drawLine(20 + 40 + 100 - i - (int) (radius * Math.cos(Math.toRadians(45))),
                   40 + radius + (int) (radius * Math.sin(Math.toRadians(45))),
                   20 + 40 + 100 - 60 -i, 40 + radius + 60-l*3/7); // แขนซ้าย
            g.drawLine(20 + 40 + 100-i + (int) (radius * Math.cos(Math.toRadians(45))),
                    40 + radius + (int) (radius * Math.sin(Math.toRadians(45))),
                    20 + 40 + 100 + 60-i*2, 40 + radius + 60+l*2/7);// แขนขวา
          g.drawLine(20 + 40 + 100-i, 40 + 2 * radius,
                    20 + 40 + 100-i*2, 40 + radius + 80);
           g.drawLine(20 + 40 + 100-i*2, 40 + radius + 80,140-i*3, 40 + radius
                  + 80 + 40);
           g.drawLine(20 + 40 + 100-i*2, 40 + radius + 80, 180-i*3, 40 + radius
                   + 80 + 40);
            if(o == 0){
                i--;
                l--;
            }
            else{
               i++;
               l++;
            }
        }
    }
    public static void main(String[] args) {
        w9__7 frame = new w9__7();
        frame.setTitle("test1");
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
