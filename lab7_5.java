package z;

class circle extends GeometricObject {

    double R;

    circle() {
        R = 1;
    }

    circle(double r) {
        R = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(R, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * R;
    }

    public boolean equals(circle B) {
        return this.R == B.R;
    }

    public boolean compareTo(circle B) {
        return R == B.R;
    }
}

class Rectangle extends GeometricObject {

    private final double H;
    private final double W;

    Rectangle() {
        H = 1;
        W = 1;
    }

    Rectangle(double h, double w) {
        H = h;
        W = w;
    }

    @Override
    public double getArea() {
        return H * W;
    }

    @Override
    public double getPerimeter() {
        return (H + W) * 2;
    }

    public boolean equals(Rectangle B) {
        return getArea() == B.getArea();
    }

    public boolean compareTo(Rectangle B) {
        return getArea() == B.getArea();
    }
}

class Octagon extends GeometricObject {

    private final double R;

    Octagon() {
        R = 1;
    }

    Octagon(double r) {
        R = r;
    }

    @Override
    public double getArea() {
        return ((2 + 8) / Math.sqrt(2)) * Math.pow(R, 2);
    }

    @Override
    public double getPerimeter() {
        return R * 8;
    }

    public boolean equals(Octagon B) {
        return getArea() == B.getArea();
    }

    public boolean compareTo(Octagon B) {
        return getArea() == B.getArea();
    }
}

class ComparableCircle extends circle {

    ComparableCircle(double r) {
        super.R = r;
    }

    boolean compareTo(ComparableCircle B) {
        return R > B.R;
    }
}

public class lab7_5 {

    public static void main(String[] args) {
        ComparableCircle A = new ComparableCircle(7);
        ComparableCircle B = new ComparableCircle(7);
        System.out.println(A.getArea());
        System.out.println(B.getPerimeter());
        System.out.println(A.equals(B));
        System.out.println(A.compareTo(B));

    }

}
