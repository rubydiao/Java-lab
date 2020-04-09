/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1;

import java.util.Scanner;

/**
 *
 * @author User
 */
class square{
    private double x,y,w,h;
    private double x1,x2,y1,y2;
    square(double x,double y,double w,double h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.x1 = (x-(w/2));
        this.x2 = (y+(h/2));
        this.y1 = (x+(w/2));
        this.y2 = (y-(h/2));
    }
    public boolean inside(square a){
        if(this.y1 < a.x1 || a.y1 < this.x1 ){
            return false;
        }
        
        if(this.x2 < a.y2 || a.x2 < this.y2 ){
            return false;
        }
        return true;
    }
}
public class w1_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x,y,w,h;
        System.out.print("Enter r1's center x,y-coordinate, width and height: ");
        x = in.nextDouble();
        y = in.nextDouble();
        w = in.nextDouble();
        h = in.nextDouble();
        square sq1 = new square(x,y,w,h);
        System.out.print("Enter r2's center x,y-coordinate, width and height: ");
        x = in.nextDouble();
        y = in.nextDouble();
        w = in.nextDouble();
        h = in.nextDouble();
        square sq2 = new square(x,y,w,h);
        
        if(sq2.inside(sq1)){
            System.out.println("r2 is inside r1");
        }
        else{
            System.out.println("r2 overlaps r1");
        }
    }
}
