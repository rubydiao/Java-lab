
package complex;
import java.util.Scanner;
class LinearEquation{
    private  double a,b,c,d,e,f;
    LinearEquation(double a,double b,double c,double d, double e , double f){
        this.a = a;        this.b = b;        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;


    }
    public double geta(){
        return a;
    }
    public double getb(){
        return b;
    }
    public double getc(){
        return c;
    }
    public double getd(){
        return d;
    }
    public double gete(){
        return e;
    }
    public double getf(){
        return f;
    }
    public double isSolvable(){
       return (a*d)-(b*c);
    }
    public double getx(){
        return (((e*d)-(b*f))/((a*d)-(b*c)));
    }
    public double gety(){
        return (((a*f)-(e*c))/((a*d)-(b*c)));
        
    }
    
}
public class complex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        double a,b,c,d,e,f ;
        System.out.print("Enter a b c d e f : ");
        LinearEquation ff = new LinearEquation(9.0,4.0,3.0,-5.0,-6.0,-21.0);
        if(ff.isSolvable()!= 0.0){
            System.out.println(" X is"+ff.getx());
            System.out.println( "Y is"+ff.gety());
        }
        else{
            System.out.print("The Equa hasn't solution");
        }
        
        
        
        
        
        
    }
    
}
