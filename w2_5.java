package Roach;

import java.util.Scanner;

class rp {

    private int count;

    rp(int count) {
        this.count = count;
    }

    public double wait(int x) {
        count += count;
        return count;
    }

    void spray() {
        count = count - (count / 10);
    }

    int getroach() {
        return count;
    }

};

public class w2_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int round, Roach;
        Roach = input.nextInt();
        round = input.nextInt();
        rp l = new rp(Roach);
        for (int i = 0; i < round; i++) {
            l.wait(Roach);
            l.spray();
                                               }
        System.out.println(l.getroach());
    }

}
