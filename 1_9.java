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
class Prime{
    
    public boolean IsPrime(int a){
        boolean check = true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
    
}
public class w1_9 {
    public static void main(String[] args) {
        Prime p = new Prime();
        Scanner in = new Scanner(System.in);
        boolean first = true;
        int max=0;
        while(true){
            int x = in.nextInt();
            if(x==0){break;}
            if(p.IsPrime(x)){
                if(first){
                max = x;
                first = false;
            }
                if(x>max){
                    max = x;
                }
            }
        }
        if(max==0){
            System.out.println("-1");
        }
        else{
            System.out.println(max);
        }
    }
}
