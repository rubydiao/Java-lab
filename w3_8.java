package w3;

import java.util.Scanner;

class poke{
    Scanner sc = new Scanner(System.in);
    
    poke(int y,int x){
        cart = new int [y][x];
    }
    
    private int cart[][];
    
    public void addData(){
        for(int i = 0;i < cart.length;i++){
            for(int j = 0; j < cart[i].length;j++){
                cart[i][j] = sc.nextInt();
            }
        }
    }
    
    public void po(){
        int a = 0 ,b = 0,y = 0,x = 0;
        for(int i = 0;i < cart.length-1;i++){
            for(int j = 0; j < cart[i].length;j++){
               if(Math.abs(cart[i][j]-cart[i+1][j]) < 10 && cart[i][j]+cart[i+1][j] > a+b){
                   a = cart[i][j];
                   b = cart[i+1][j];
                   y = i;
                   x = j;
               }
                
            }
        }
        System.out.printf("%d %d\n",y+1,x+1);
    }
}

public class w3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        poke aa = new poke(sc.nextInt(),sc.nextInt());
        aa.addData();
        aa.po();
    }
    
}
