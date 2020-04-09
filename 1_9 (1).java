package w1;

import java.util.Scanner;

class Primenum {

    public boolean Prime(int round) {
        boolean rt = true;
        for (int i = 2; i < round; i++) {
            if (round % i == 0) {
                rt = false;
                break;
            }
        }
        return rt;
    }

}

public class w1_9 {

    public static void main(String[] args) {
        Primenum dd = new Primenum();
        Scanner sc = new Scanner(System.in);
        boolean st = true;
        int d = 0;
        while (true) {
            int c = sc.nextInt();
            if (c == 0) {
                break;
            }
            if (dd.Prime(c)) {
                if (st) {
                    d = c;
                   st = false;
                }
                if (c > d) {
                    d = c;
                }
            }
        }
        if (d == 0) {
            System.out.println("-1");
        } else {
            System.out.println(d);
        }
    }
}
