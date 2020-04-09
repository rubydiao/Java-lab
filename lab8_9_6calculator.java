package z;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab8_9_6calculator extends JFrame {

    JTextField sum = new JTextField("");

    double A = 0;
    double B = 0;
    String C = "";

    JButton No_0 = new JButton("0");
    JButton No_1 = new JButton("1");
    JButton No_2 = new JButton("2");
    JButton No_3 = new JButton("3");
    JButton No_4 = new JButton("4");
    JButton No_5 = new JButton("5");
    JButton No_6 = new JButton("6");
    JButton No_7 = new JButton("7");
    JButton No_8 = new JButton("8");
    JButton No_9 = new JButton("9");
    JButton dot = new JButton(".");
    JButton pass = new JButton("+");
    JButton mati = new JButton("*");
    JButton han = new JButton("/");
    JButton lom = new JButton("-");
    JButton cla = new JButton("C");
    JButton pow = new JButton("X^");
    JButton Sq = new JButton("√");
    JButton s = new JButton("=");
    JButton ps = new JButton("±");

    lab8_9_6calculator() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 4, 2, 2));
        sum.setHorizontalAlignment(JTextField.RIGHT);
        sum.setEditable(false);

        p1.add(Sq);
        p1.add(pow);
        p1.add(ps);
        p1.add(cla);
        p1.add(No_7);
        p1.add(No_8);
        p1.add(No_9);
        p1.add(pass);
        p1.add(No_6);
        p1.add(No_5);
        p1.add(No_4);
        p1.add(lom);
        p1.add(No_1);
        p1.add(No_2);
        p1.add(No_3);
        p1.add(mati);
        p1.add(No_0);
        p1.add(dot);
        p1.add(s);
        p1.add(han);

        Sq.addActionListener(new BAction());
        pow.addActionListener(new BAction());
        ps.addActionListener(new BAction());
        cla.addActionListener(new BAction());
        No_7.addActionListener(new BAction());
        No_8.addActionListener(new BAction());
        No_9.addActionListener(new BAction());
        pass.addActionListener(new BAction());
        No_6.addActionListener(new BAction());
        No_5.addActionListener(new BAction());
        Sq.addActionListener(new BAction());
        No_4.addActionListener(new BAction());
        lom.addActionListener(new BAction());
        No_1.addActionListener(new BAction());
        No_2.addActionListener(new BAction());
        No_3.addActionListener(new BAction());
        mati.addActionListener(new BAction());
        No_0.addActionListener(new BAction());
        dot.addActionListener(new BAction());
        s.addActionListener(new BAction());
        han.addActionListener(new BAction());

        add(sum, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        lab8_9_6calculator cal = new lab8_9_6calculator();
        cal.setTitle("lab8_9_6calculator");
        cal.setSize(240, 220);
        cal.setVisible(true);
        cal.setLocationRelativeTo(null);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class BAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == No_0) {
                if (!"".equals(sum.getText())) {
                    sum.setText(sum.getText() + "0");
                }
            } else if (e.getSource() == No_1) {
                sum.setText(sum.getText() + "1");
            } else if (e.getSource() == No_2) {
                sum.setText(sum.getText() + "2");
            } else if (e.getSource() == No_3) {
                sum.setText(sum.getText() + "3");
            } else if (e.getSource() == No_4) {
                sum.setText(sum.getText() + "4");
            } else if (e.getSource() == No_5) {
                sum.setText(sum.getText() + "5");
            } else if (e.getSource() == No_6) {
                sum.setText(sum.getText() + "6");
            } else if (e.getSource() == No_7) {
                sum.setText(sum.getText() + "7");
            } else if (e.getSource() == No_8) {
                sum.setText(sum.getText() + "8");
            } else if (e.getSource() == No_9) {
                sum.setText(sum.getText() + "9");
            } else if (e.getSource() == dot) {

                boolean ic = false;

                for (int i = 0; i < sum.getText().length(); i++) {
                    if (sum.getText().charAt(i) == '.') {
                        ic = true;
                        break;
                    }
                }

                if (ic) {
                    sum.setText(sum.getText() + "");
                } else if ("".equals(sum.getText())) {
                    sum.setText("0.");
                } else {
                    sum.setText(sum.getText() + ".");
                }
            } else if (e.getSource() == pass) {

                A = Double.parseDouble(sum.getText());
                C = "pass";
                sum.setText("");
            } else if (e.getSource() == mati) {

                A = Double.parseDouble(sum.getText());
                C = "mati";
                sum.setText("");
            } else if (e.getSource() == han) {

                A = Double.parseDouble(sum.getText());
                C = "han";
                sum.setText("");
            } else if (e.getSource() == lom) {

                A = Double.parseDouble(sum.getText());
                C = "lom";
                sum.setText("");
            } else if (e.getSource() == cla) {
                sum.setText("");
                A = 0;
                B = 0;
                C = "";
            } else if (e.getSource() == pow) {
                A = Double.parseDouble(sum.getText());
                sum.setText(String.format("%.2f", Math.pow(A, 2)));
            } else if (e.getSource() == Sq) {
                A = Double.parseDouble(sum.getText());
                sum.setText(String.format("%.2f", Math.pow(A, 0.5)));
            } else if (e.getSource() == s) {
                switch (C) {
                    case "pass":
                        B = Double.parseDouble(sum.getText());
                        sum.setText(String.format("%.2f", A + B));
                        break;
                    case "mati":
                        B = Double.parseDouble(sum.getText());
                        sum.setText(String.format("%.2f", A * B));
                        break;
                    case "han":
                        B = Double.parseDouble(sum.getText());
                        sum.setText(String.format("%.2f", A / B));
                        break;
                    case "lom":
                        B = Double.parseDouble(sum.getText());
                        sum.setText(String.format("%.2f", A - B));
                        break;
                    default:
                        break;
                }
            } else if (e.getSource() == ps) {
                A = Double.parseDouble(sum.getText());
                if (A < 0) {
                    sum.setText(String.format("%.2f", A * (-1)));
                } else {
                    sum.setText(String.format("%.2f", A));
                }

            }
        }

    }

}
