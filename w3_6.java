package w3;

import java.util.Scanner;

class dot{
    Scanner sc = new Scanner(System.in);
    dot(int many){
       pulls = new double [many][2];
        this.many = many;
    }
    private int many;
    private final double pulls[][];
    
    public void adddata(){
        for(int i = 0 ;i < many;i++){
            pulls[i][0] = sc.nextDouble();
            pulls[i][1] = sc.nextDouble();
        }
    }
    
    public void fix(){
        double a = 10000;
        for(int i = 0;i < many;i++){
            for(int j = 0;j < many;j++){
                double b = Math.sqrt((Math.pow(pulls[i][0] - pulls[j][0], 2))+(Math.pow(pulls[i][1] - pulls[j][1], 2)));
                if(b < a && i != j){
                    a = b;
            }
            }
        }
        System.out.printf("%.2f \n",a);
    }
}

public class w3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        dot a2 = new dot(a);
        a2.adddata();
        a2.fix();
        
    }
    
}
