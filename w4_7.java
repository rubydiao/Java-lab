package w4;

import java.util.Scanner;

class box{
    public boolean isConsecutiveFour(int[][] values){
        if(values.length >= 4){
            for(int y = 0;y < values.length-3;y++){
                for(int x = 0;x < values[0].length;x++){
                    if(values[y+1][x] == values[y][x] && values[y+2][x] == values[y][x] && values[y+3][x] == values[y][x]){
                        return true;
                    }
                }
            }
        }
        if(values[0].length >= 4){
            for(int y = 0;y < values.length;y++){
                for(int x = 0;x < values[0].length-3;x++){
                    if(values[y][x+1] == values[y][x] && values[y][x+2] == values[y][x] && values[y][x+3] == values[y][x]){
                        return true;
                    }
                }
            }
        }
        if(values[0].length >= 4 && values.length >= 4){
            for(int y = 0;y < values.length-3;y++){
                for(int x = 0;x < values[0].length-3;x++){
                    if(values[y+1][x+1] == values[y][x] && values[y+2][x+2] == values[y][x] && values[y+3][x+3] == values[y][x]){
                        return true;
                    }
                }
            }
            
            for(int y = 0;y < values.length-3;y++){
                for(int x = 3;x < values[0].length-3;x++){
                    if(values[y+1][x-1] == values[y][x] && values[y+2][x-2] == values[y][x] && values[y+3][x-3] == values[y][x]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

public class w4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [sc.nextInt()][sc.nextInt()];
        for(int y = 0;y < a.length;y++){
            for(int x = 0;x < a[0].length;x++){
                a[y][x] = sc.nextInt();
            }
        }
        box b = new box();
        System.out.println(b.isConsecutiveFour(a));
    }
    
}
