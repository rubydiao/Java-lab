package z;

import java.util.Scanner;
import java.util.ArrayList;

public class lab8_9_11 {

    static int maxnow = 0;

    static void mtr(ArrayList<Integer> Meteo, int max) {
        if (Meteo.size() <= 1 && max > maxnow) {
            if (max > maxnow) {
                maxnow = max;
            }
            return;
        }

        for (int i = 0; i < Meteo.size() - 1; i++) {
            ArrayList<Integer> MeteoNew = new ArrayList();

            for (int j = 0; j < Meteo.size(); j++) {
                MeteoNew.add(Meteo.get(j));
            }

            int max_2 = Math.abs(MeteoNew.get(i) - MeteoNew.get(i + 1));
            MeteoNew.remove(i + 1);
            MeteoNew.remove(i);
            mtr(MeteoNew, max+max_2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Meteo = new ArrayList();
        int a = sc.nextInt(), b;
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            Meteo.add(b);
        }
        mtr(Meteo, 0);
        System.out.println(maxnow);
    }
}
