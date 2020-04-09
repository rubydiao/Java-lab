
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

class w8_5 extends JFrame {

    private JTextField jtfca = new JTextField();
    private JTextField jtfus = new JTextField();

    private JButton jbtcon = new JButton("Convert");

    public w8_5() {
        JPanel jp2 = new JPanel(new GridLayout(3, 2));
        jp2.add(new JLabel("US Dollars"));
        jp2.add(jtfus);
        jp2.add(new JLabel("Canadian Dollars"));
        jp2.add(jtfca);
        jtfus.setHorizontalAlignment(JTextField.RIGHT);

        JPanel jpy = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpy.add(jbtcon);
        add(jp2, BorderLayout.CENTER);
        add(jpy, BorderLayout.SOUTH);

        jbtcon.addActionListener(new ButtonListener());

    }

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double dollar = Double.parseDouble(jtfus.getText());
            cal a = new cal(dollar);
            jtfca.setEnabled(false);
            jtfca.setText(String.format("%.2f", a.Total()));
            if (e.getSource() == jbtcon) {
                jtfus.setHorizontalAlignment(JTextField.RIGHT);
                jtfca.setHorizontalAlignment(JTextField.RIGHT);
            }
        }

    }

    class cal {

        private double us;

        public cal() {
            this(1);
        }

        public cal(double us) {
            this.us = us;
        }

        public double get_US() {
            return this.us;
        }

        public double Total() {
            double total;
            return total = us * 1.5;
        }
    }

    public static void main(String[] args) {

        w8_5 frame = new w8_5();
        frame.pack();
        frame.setTitle("Convert US to Canadian Dollars");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
