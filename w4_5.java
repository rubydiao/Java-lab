package w4;

import java.util.Scanner;

class kib{
    private int max = 0;
    
    public void town(int y1 [][],int x2){
        for(int y = 0;y < y1.length-(x2-1);y++){
            for(int x = 0;x < y1[0].length-(x2-1);x++){
                int now = 0;
                for(int yy = y;yy < y+x2;yy++){
                    for(int xx = x;xx < x+x2;xx++){
                        now += y1[yy][xx];
                    }
                }
                if(now > max){
                    max = now;
                }
            }
        }
    }
    
    public void print(){
        System.out.println(max);
    }
}

public class w4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kib b1 = new kib();
        int x2;
        int y1[][] = new int[sc.nextInt()][sc.nextInt()];
        x2 = sc.nextInt();
        
        for(int i = 0;i < y1.length;i++){
            for(int j = 0; j < y1[0].length;j++){
                y1[i][j] = sc.nextInt();
            }
        }
        b1.town(y1, x2);
        b1.print();
    }
    
}
