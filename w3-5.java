package w3;
import java.util.Scanner;

class MatrixMultiplication{
    private double A[][], B[][];
    private int nn, bb, n, m;
    
    MatrixMultiplication(double a[][], double b[][], int nn, int bb, int n, int m){
        this.A = a;
        this.B = b;
        this.nn = nn;
        this.bb = bb;
        this.n = n;
        this.m = m;
    }
    
    double[][] M(){
        double C[][] = new double[nn][bb];
        for(int i = 0; i < nn; i++){
            for(int j = 0; j < bb; j++){
                int sum = 0;
                for(int k = 0; k < m; k++){
                    sum += (A[i][k] * B[k][j]);
                }
                C[i][j] = sum;
            }
        }
        for(int i = 0; i < nn; i++){
            for(int j = 0; j < bb; j++){
                System.out.printf("%.0f ", C[i][j]);
            }
            System.out.println();
        }
        return C;
    }
    
    
}

public class no5 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt(), m = ip.nextInt();
        double A[][] = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = ip.nextDouble();
            }
        }
            
        int a = ip.nextInt(), b = ip.nextInt();
        double B[][] = new double[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                B[i][j] = ip.nextDouble();
            }
        }
        
        if(m == a){
            int nn = n;
            int bb = b;
            MatrixMultiplication M = new MatrixMultiplication(A, B, nn, bb, n, m);
            System.out.println("");
            M.M();
        }
    }
}
