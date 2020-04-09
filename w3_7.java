package w3;

import java.util.Scanner;
import java.util.Arrays;

class OneTwo{
    Scanner sc = new Scanner(System.in);
    OneTwo(int a){
        
        minint = new int[a];
    }
    
    private int minint[];
    
    public void adddata(){
        for(int i = 0;i < minint.length;i++){
           minint[i] = sc.nextInt();
        }
    }
    
    public void setup(){
         Arrays.sort(minint);
         int a = 0,b = 0;
         for(int i = minint.length-1;i >= 0;i--){
             if(a < b){
                 a += minint[i];
             }
             else{
                 b += minint[i];
             }
             
             
         }
         System.out.println(Math.abs(a-b));
    }
    
}

public class w3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OneTwo sss = new OneTwo(sc.nextInt());
        sss.adddata();
        sss.setup();
    }
    
}
