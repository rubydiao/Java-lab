
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

abstract class AbstractDrawFunction extends JPanel {

    /**
     * Polygon to hold the points
     */
    private Polygon p = new Polygon();

    /**
     * Default constructor
     */
    protected AbstractDrawFunction() {
        drawFunction();
        setBackground(Color.pink);
    }

    /**
     * Draw the function
     */
    public abstract double f(double x);

    /**
     * Obtain points for x coordinates 100, 101, ..., 300
     */
    public void drawFunction() {
        for (int x = -100; x <= 100; x++) {
            p.addPoint(x + 200, 200 - (int) f(x));
        }
    }

    /**
     * Paint the function diagram
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
// Draw x axis
        g.drawLine(10, 200, 390, 200);
// Draw y axis
        g.drawLine(200, 30, 200, 390);
// Draw arrows on x axis
        g.drawLine(390, 200, 370, 190);
        g.drawLine(390, 200, 370, 210);
// Draw arrows on y axis
        g.drawLine(200, 30, 190, 50);
        g.drawLine(200, 30, 210, 50);
// Draw x, y
        g.drawString("X", 370, 170);
        g.drawString("Y", 220, 40);
// Draw a polygon line by connecting the points in the polygon
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }

    

    
}
class DrawSine extends AbstractDrawFunction{
        public DrawSine(){
            
        }
        public double f(double x){
            return (100*Math.sin(x));
        }
        
}
class DrawCos extends AbstractDrawFunction{
        public DrawCos(){
            
        }
        public double f(double x){
            return (100*Math.cos(x));
        }
        
}
class DBX extends AbstractDrawFunction{
        public DBX(){
            
        }
        public double f(double x){
            return (Math.pow(x, 2));
        }
        
}
class DrawTan extends AbstractDrawFunction{
        public DrawTan(){
            
        }
        public double f(double x){
            return (100*Math.tan(x));
        }
        
}
class E extends AbstractDrawFunction{
        public E(){
            
        }
        public double f(double x){
            return (Math.cos(x)+5*Math.sin(x));
        }
        
}
class F extends AbstractDrawFunction{
        public F(){
            
        }
        public double f(double x){
            return (5*Math.cos(x)+Math.sin(x));
        }
        
}
class G extends AbstractDrawFunction{
        public G(){
            
        }
        public double f(double x){
            return (Math.log(x)+Math.pow(x,2));
        }
        
}

class Test extends JFrame {
        
        public Test() {
            getContentPane().setLayout(new GridLayout(1, 2, 5, 5));
            getContentPane().add(new DrawSine());
            getContentPane().add(new DrawCos());
            getContentPane().add(new DrawTan());
            getContentPane().add(new DBX());
            getContentPane().add(new E());
            getContentPane().add(new F());
            getContentPane().add(new G());
        }

        public static void main(String[] args) {
            Test frame = new Test();
            frame.setSize(400, 400);
            frame.setTitle("Exercise 10.10");
            frame.setVisible(true);
        }
    }
