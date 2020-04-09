/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

class w8_6 extends JFrame{

    private JButton jbt1 = new JButton("√");
    private JButton jbt2 = new JButton("x2");
    private JButton jbt3= new JButton("+-");
    private JButton jbt4 = new JButton("C");
    private JButton jbt5 = new JButton("7");
    private JButton jbt6 = new JButton("8");
    
    private JButton jbt7= new JButton("9");
    private JButton jbt8 = new JButton("+");
    private JButton jbt9 = new JButton("6");
    private JButton jbt10 = new JButton("5");
    private JButton jbt11 = new JButton("4");
    private JButton jbt12 = new JButton("-");
    private JButton jbt13 = new JButton("1");
    private JButton jbt14 = new JButton("2");
    private JButton jbt15 = new JButton("3");
    private JButton jbt16 = new JButton("*");
    private JButton jbt17 = new JButton("0");
    private JButton jbt18 = new JButton(".");
    private JButton jbt19 = new JButton("=");
    private JButton jbt20 = new JButton("/");
    private JTextField jtfa = new JTextField();
    w8_6(){
        JPanel jp2 = new JPanel(new GridLayout(1,1));
        jp2.add(jtfa,new Label("0"));
        jtfa.setHorizontalAlignment(JTextField.RIGHT);
        JPanel jpy = new JPanel(new GridLayout(5,4,1,1));
        jpy.add(jbt1);
        jbt1.addActionListener(new ButtonListener());
        jpy.add(jbt2);
         jbt2.addActionListener(new ButtonListener());
        jpy.add(jbt3);
         jbt3.addActionListener(new ButtonListener());
        jpy.add(jbt4);
         jbt4.addActionListener(new ButtonListener());
        jpy.add(jbt5);
         jbt5.addActionListener(new ButtonListener());
        jpy.add(jbt6);
         jbt6.addActionListener(new ButtonListener());
        jpy.add(jbt7);
         jbt7.addActionListener(new ButtonListener());
        jpy.add(jbt8);
         jbt8.addActionListener(new ButtonListener());
        jpy.add(jbt9);
         jbt9.addActionListener(new ButtonListener());
        jpy.add(jbt10);
         jbt10.addActionListener(new ButtonListener());
        jpy.add(jbt11);
         jbt11.addActionListener(new ButtonListener());
        jpy.add(jbt12);
         jbt12.addActionListener(new ButtonListener());
        jpy.add(jbt13);
         jbt13.addActionListener(new ButtonListener());
        jpy.add(jbt14);
         jbt14.addActionListener(new ButtonListener());
        jpy.add(jbt15);
         jbt15.addActionListener(new ButtonListener());
        jpy.add(jbt16);
         jbt16.addActionListener(new ButtonListener());
        jpy.add(jbt17);
         jbt17.addActionListener(new ButtonListener());
        jpy.add(jbt18);
         jbt18.addActionListener(new ButtonListener());
        jpy.add(jbt19);
         jbt19.addActionListener(new ButtonListener());
        jpy.add(jbt20);
         jbt20.addActionListener(new ButtonListener());
       
        
        
        add(jp2, BorderLayout.CENTER);
        add(jpy, BorderLayout.SOUTH);


    }
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbt7) {
                jtfa.setText(jtfa.getText()+"9");
            }
             if (e.getSource() == jbt9) {
                jtfa.setText(jtfa.getText()+"6");
             }
              if (e.getSource() == jbt10) {
                  jtfa.setText(jtfa.getText()+"5");  
            }
               if (e.getSource() == jbt13) {
                jtfa.setText(jtfa.getText()+"1");
            }
               if (e.getSource() == jbt14) {
                jtfa.setText(jtfa.getText()+"2");
            }
               if (e.getSource() == jbt15) {
                jtfa.setText(jtfa.getText()+"3");
            }
               if (e.getSource() == jbt17) {
                jtfa.setText(jtfa.getText()+"0");
            }
               if (e.getSource() == jbt11) {
                jtfa.setText(jtfa.getText()+"4");
            }
               if (e.getSource() == jbt5) {
                jtfa.setText(jtfa.getText()+"7");
            }
               if (e.getSource() == jbt6) {
                jtfa.setText(jtfa.getText()+"8");
            }
               if (e.getSource() == jbt11) {
                jtfa.setText(jtfa.getText()+"4");
            }
               
             
                
                
        }

    }
    public static void main(String[] args) {
       w8_6 frame = new w8_6();
       frame.pack();
        frame.setTitle("Convert US to Canadian Dollars");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
