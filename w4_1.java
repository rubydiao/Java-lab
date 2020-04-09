
import java.util.Scanner;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;

class w1 {

    private ArrayList<Integer> data = new ArrayList<Integer>();

    w1() {

    }

    public void add(int value) {
        data.add(value);
    }

    public double avg() {
        double ans = 0, anw;
        for (int i = 0; i < data.size(); i++) {
            ans += data.get(i);
        }
        anw = ans / data.size();
        return anw;
    }

    public int max() {
        int max = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > max) {
                max = data.get(i);
            }
        }
        return max;
    }

    public int min() {
        int min = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < min) {
                min = data.get(i);
            }
        }
        return min;
    }

    public void print() {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 != 0) {
                System.out.print(data.get(i) + " ");
            }
        }
        System.out.println("");

    }
}

public class w4_1 {

    public static void main(String[] args) throws FileNotFoundException {
        w1 l = new w1();
        Scanner sc = new Scanner(new File("n.txt"));
        while (sc.hasNext()) {
            int word = Integer.parseInt(sc.next());
            l.add(word);
        }
        System.out.println(l.avg());
        System.out.println(l.max());
        System.out.println(l.min());
        l.print();
    }

}
