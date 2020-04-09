
package w2;

import java.util.Scanner;

class CheckTriangle {

    public static double Check(double x0, double y0, double x1, double y1, double x2, double y2) {
        if (Math.abs((y2 - y0) / (x2 - x0)) == Math.abs(((y2 - y1) / (x2 - x1)))) {
            return 0;
        } else if (Math.abs((y2 - y0) / (x2 - x0)) < Math.abs(((y2 - y1) / (x2 - x1)))) {
            return 1;
        } else {
            return 2;
        }

    }

}

public class w2_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2;
        CheckTriangle a = new CheckTriangle();
        x0 = sc.nextDouble();
        y0 = sc.nextDouble();
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        System.out.printf("%.0f \n", a.Check(x0, y0, x1, y1, x2, y2));

    }

}
