package z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;

public class lab8_9_8 extends JFrame {

    ArrayList<Account> Account_p = new ArrayList();

    Account p;
    int now = 0;

    JLabel Title = new JLabel("ACCOUNT MONEY");
    ac info = new ac();

    lab8_9_8() {
        this.setLayout(null);
        add(Title);
        Title.setBounds(250, 10, 600, 10);
        add(info);
        info.setBounds(12, 0, 600, 768);
    }

    class Account {

        private int ID, Day, Month, Year, Day_b, Month_b, Year_b, Age;
        private double Money, Rate;
        private String Name, LName;

        Account(int ID, int Day, int Month, int Year, double Money, double Rate, int Day_b, int Month_b, int Year_b, int Age, String Name, String LName) {
            this.Age = Age;
            this.Day = Day;
            this.Day_b = Day_b;
            this.ID = ID;
            this.LName = LName;
            this.Money = Money;
            this.Month = Month;
            this.Month_b = Month_b;
            this.Name = Name;
            this.Rate = Rate;
            this.Year = Year;
            this.Year_b = Year_b;
        }

        @Override
        public String toString() {
            return Name + "  " + LName + "  " + String.format("%.2f", Money) + "  " + "Birth Day : "+Day_b+" "+Month_b+" "+Year_b + "   " + "Account Amount : "+Account_p.size();
        }
    }

    class ac extends JPanel implements ActionListener {

        JLabel bord = new JLabel("Enter Data Account Money");

        JButton save = new JButton("Save");

        JLabel ID = new JLabel("ID :");
        JTextField ID_ = new JTextField();
        JLabel Money = new JLabel("MONEY:");
        JTextField Money_ = new JTextField();
        JLabel baht = new JLabel("BAHT");
        JLabel Rate = new JLabel("ANNUALINTERATE RATE :");
        JTextField Rate_ = new JTextField();
        JLabel Name = new JLabel("FIRST NAME :");
        JTextField Name_ = new JTextField();
        JLabel LName = new JLabel("LAST NAME:");
        JTextField LName_ = new JTextField();
        JLabel Age = new JLabel("AGE :");
        JTextField Age_ = new JTextField();
        JLabel OP = new JLabel("DAY OPEN ACCOUNT :");
        ComboBox dayy_o = new ComboBox(1, 31);
        ComboBox month = new ComboBox(1, 12);
        ComboBox yeatt_o = new ComboBox(1980, 2026);
        JLabel BD = new JLabel("BIRTH DAY :");
        ComboBox dayy = new ComboBox(1, 31);
        ComboBox mon = new ComboBox(1, 12);
        ComboBox yeatt = new ComboBox(1980, 2026);

        ac() {
            save.addActionListener(this);
            this.setLayout(null);
            add(bord);
            bord.setBounds(10, 30, 200, 20);
            add(ID);
            ID.setBounds(10, 70, 20, 20);
            add(ID_);
            ID_.setHorizontalAlignment(JTextField.RIGHT);
            ID_.setBounds(40, 70, 200, 20);
            add(Money);
            Money.setBounds(300, 70, 50, 20);
            add(Money_);
            Money_.setHorizontalAlignment(JTextField.RIGHT);
            Money_.setBounds(360, 70, 150, 20);
            add(Rate);
            Rate.setBounds(10, 110, 130, 20);
            add(Rate_);
            Rate_.setHorizontalAlignment(JTextField.RIGHT);
            Rate_.setBounds(150, 110, 150, 20);
            add(OP);
            OP.setBounds(10, 150, 130, 20);
            add(dayy_o.Box);
            dayy_o.Box.setBounds(150, 150, 40, 20);
            add(month.Box);
            month.Box.setBounds(190, 150, 40, 20);
            add(yeatt_o.Box);
            yeatt_o.Box.setBounds(230, 150, 60, 20);
            add(Name);
            Name.setBounds(10, 190, 70, 20);
            add(Name_);
            Name_.setHorizontalAlignment(JTextField.RIGHT);
            Name_.setBounds(90, 190, 150, 20);
            add(LName);
            LName.setBounds(250, 190, 70, 20);
            add(LName_);
            LName_.setHorizontalAlignment(JTextField.RIGHT);
            LName_.setBounds(330, 190, 150, 20);
            add(BD);
            BD.setBounds(10, 230, 60, 20);
            add(dayy.Box);
            dayy.Box.setBounds(80, 230, 40, 20);
            add(mon.Box);
            mon.Box.setBounds(120, 230, 40, 20);
            add(yeatt.Box);
            yeatt.Box.setBounds(160, 230, 60, 20);
            add(Age);
            Age.setBounds(240, 230, 30, 20);
            add(Age_);
            Age_.setHorizontalAlignment(JTextField.RIGHT);
            Age_.setBounds(280, 230, 50, 20);
            add(save);
            save.setBounds(260, 270, 70, 30);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == save) {
                p = new Account(Integer.parseInt(ID_.getText()), Integer.parseInt(dayy_o.Box.getSelectedItem().toString()), Integer.parseInt(month.Box.getSelectedItem().toString()), Integer.parseInt(yeatt_o.Box.getSelectedItem().toString()), Double.parseDouble(Money_.getText()), Double.parseDouble(Rate_.getText()), Integer.parseInt(dayy.Box.getSelectedItem().toString()), Integer.parseInt(mon.Box.getSelectedItem().toString()), Integer.parseInt(yeatt.Box.getSelectedItem().toString()), Integer.parseInt(Age_.getText()), Name_.getText(), LName_.getText());
                Account_p.add(p);
                System.out.println(Account_p.get(now));
                now++;
            }
        }
    }

    class ComboBox extends JComboBox {

        JComboBox<Integer> Box = new JComboBox();

        ComboBox(int min, int max) {
            for (int i = 0; i <= max - min; i++) {
                Box.addItem(i + min);
            }
        }
    }

    public static void main(String[] args) {
        lab8_9_8 Fream = new lab8_9_8();
        Fream.setTitle("Show Detail of Account Application");
        Fream.setSize(600, 340);
        Fream.setVisible(true);
        Fream.setResizable(false);
        Fream.setLocationRelativeTo(null);
        Fream.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
