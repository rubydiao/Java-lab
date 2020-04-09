
import java.util.Scanner;

class Mytri {

    private double side1, side2, side3, area = 0,s=0;
    

    public double side1(double side1) {
        return this.side1 = side1;
        

    }
    public double side2(double side2) {
        return this.side2 = side2;
        

    }
    public double side3(double side3) {
        return this.side3 = side3;
        

    }

    public boolean isValid(double side1, double side2, double side3) {
       if((side1+side2)>side3){
           return true;
           
       }
        return false;
      
    }

    public double area(double side1, double side2, double side3) {
        s +=(side1+side2+side3)/2;
        area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}

public class w2_7 {

    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        Mytri n= new Mytri();
       int x,y,z; 
       x = sy.nextInt();
       y = sy.nextInt();
       z = sy.nextInt();
       n.side1(x);n.side2(y);n.side3(z);
       if(n.isValid(x, y, z)== false){
           System.out.println("0");
       }
       else{
           System.out.println("1");
           System.out.printf("%.2f",n.area(x, y, z));
       }
       

       
       
    }
}
