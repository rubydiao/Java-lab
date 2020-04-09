package w3;
import java.util.Arrays;
import java.util.Scanner;
public class AscendSortFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        Ascend a = new Ascend();
        a.AscendSort(A, n);
        a.SortCommuFreq(A, n);
    }
}
class  Ascend{
    Ascend(){     
    }
    void AscendSort(int[] B,int n){
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(B[j-1] > B[j]){         
                    temp = B[j-1];  
                    B[j-1] = B[j];  
                    B[j] = temp;  
                }                         
            }  
         }
         int b =0;
         for(int i=0;i<n;i++){
             if(B[i]!=b){
                 b = B[i];
                 System.out.print(B[i]+" ");  
             }
         }
         System.out.println();  
    }
    void SortCommuFreq(int[] B,int n){
        int j = 1;
        for(int i=0;i<n-1;i++){
            if(B[i]==B[i+1]){
                j++;
            }else{
                System.out.print(j+" ");
                j++;
            }     
        }
        System.out.print(j+" ");
    }
}