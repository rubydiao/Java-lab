package polygon;
class RegularPolygons 
{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    RegularPolygons()
    {
        
    }
    RegularPolygons (int n , double side)
    {
        this.n = n;
        this.side = side;
    }
    RegularPolygons(int n , double side , double x , double y) 
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    double getPerimeter()
    {
        return side*n;
    }
    double getArea()
    {
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));
    }
}
public class polygon {

    public static void main(String[] args) {
    RegularPolygons  a = new RegularPolygons ();
    RegularPolygons  b= new RegularPolygons (6 , 4);
    RegularPolygons  c = new RegularPolygons (10 , 4 , 5.6 , 7.8);
    System.out.println(a.getArea());
    System.out.println(b.getArea());
    System.out.println(c.getArea());


}
}