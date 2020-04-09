package w2;

import java.util.Scanner;
import java.util.ArrayList;

class Light {

    private Scanner sc = new Scanner(System.in);

    private int x = 0, ml, ms;

    private ArrayList<Integer> s = new ArrayList<>();
    private ArrayList<Integer> l = new ArrayList<>();

    public void inll(int a, int b) {
        p_s(a);
        p_l(b);
    }

    void p_l(int a) {
        ml = a;
        for (int i = 0; i < a; i++) {
            l.add(sc.nextInt());
        }
    }

    void p_s(int a) {
        ms = a;
        for (int i = 0; i < a; i++) {
            s.add(sc.nextInt());
            s.add(sc.nextInt());
        }
    }

    public void composh() {
        for (int i = 0; i < ml; i++) {
            for (int j = 0; j < s.size(); j += 2) {
                if (l.get(i) > s.get(j) && l.get(i) < s.get(j + 1)) {
                    x++;
                }
            }
        }
        System.out.println("");
        System.out.println(x);
    }
}

public class w2_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Light m = new Light();
        m.inll(sc.nextInt(), sc.nextInt());
        m.composh();
    }

}
