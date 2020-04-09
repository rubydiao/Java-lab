package w3;

import java.util.Scanner;

class fire{
    Scanner sc = new Scanner(System.in);
    fire(int a){
        fir = new int[a*2][a*2];
    }
    
    private int fir[][];
    
    public void addData(){
        for(int i = 0; i < fir.length/2;i++){
            for(int j = 0; j <fir[i].length/2;j++){
                fir[i][j] = sc.nextInt();
            }
        }
    }
    
    public void sim(){
        int money = 0;
            
        
    for(int i = 0;i < fir.length;i++){
        for(int y = 0;y <= i;y++){
            for(int x = 0;x <= i-y;x++){
                fir[y][x] = 0;
            }
        }
        int max = 0,c = 0,d = 0;
        for(int y = 0;y <= fir.length/2;y++){
            for(int x = 0;x <= fir[0].length/2;x++){
                if(fir[y][x] != 0 && fir[y][x] >= max){
                    max = fir[y][x];
                    d = y;
                    c = x;
                    
                }
            }
        }
        money += fir[d][c];
        fir[d][c] = 0;
    }
    System.out.println(money);
}
}

public class w3_9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    fire burn = new fire(sc.nextInt());
    burn.addData();
    burn.sim();
    }
    
}
