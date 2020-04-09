
package w5;

import java.util.Scanner;

class MyRectangle2D{
    public double x;
    public double y;
    public double width;
    public double height;
    MyRectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }
     MyRectangle2D(double x,double y , double width , double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
     public double getArea(){
         return this.width * this.height;
     }
     public double getPerimeter(){
         return (this.height + this.width) * 2;
     }
     public boolean contains(double x , double y){
         if(x-this.x <= this.width){
             if(y-this.y <= this.height){
                 return true;
             }
         }
         return false;
     }
     public boolean contains(MyRectangle2D r){
        if(this.x > r.x && this.height < r.height && this.x + this.width > r.x + r.width && this.y+this.height > r.y+r.height){
            return true;
        }
        return false;
     }
     public boolean overlaps(MyRectangle2D r){
      if(this.x+this.width > r.x){
          if(this.y < r.y+r.height){
              return true;
          }
      }  
      return false;
     }
     
}
public class w5_7 {

    public static void main(String[] args) {

      MyRectangle2D MR1 = new MyRectangle2D(1,1,10,5);
      MyRectangle2D MR2 = new MyRectangle2D(5,3,9,4);
        System.out.println(MR1.getArea());
        System.out.println(MR1.getPerimeter());
         System.out.println(MR1.contains(5,4));
        System.out.println(MR1.contains(MR2));
        System.out.println(MR1.overlaps(MR2));
        
    }
    
}
