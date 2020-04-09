package javaapplication12;

class Complex {

    private double r, i;

    Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    Complex(Complex c) {
        this(c.r, c.i);
    }

    public void add(Complex c) {
        r += c.r;
        i += c.i;
    }

    public void min(Complex c) {
        r -= c.r;
        i -= c.i;
    }

    public void mut(Complex c) {
        r = (this.r * c.r) - (this.i * c.i);
        i = (this.r * c.i) + (this.i * c.r);

    }

    public void dev(Complex c) {
        double x = 0, y = 0;
        x= (this.r*c.r+this.i*c.i)/(Math.pow(c.r,2)+Math.pow(c.i, 2));
        y = ((this.i * c.r)-(this.r*c.i))/(Math.pow(c.r,2)+Math.pow(c.i, 2));
        r =  x;
        i = y;
        
    }

    public void print() {
        System.out.println(r + "+ i" + i);
    }
}

class complexTest {

    public static void main(String[] args) {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex c = new Complex(a);
      ///  c.add(b);
       // c.print();
      //  c.min(b);
      // c.print();
       // c.mut(b);
        //c.print();
        c.dev(b);
       c.print();
    }

}
