
package w4;

import java.util.ArrayList;
import java.util.Scanner;

class Star{
    private ArrayList<String> arr = new ArrayList();
    
    public void add(String value){
        arr.add(value);
    }
    
    public void addStars(){
        ArrayList<String> temp = new ArrayList();
        for (String  e:arr) {
            temp.add(e);
            temp.add("*");
        }
        this.arr = temp;
    }
    
    public void removeStars(){
        int index = 0;
        while(index!=arr.size()){
            String temp = arr.get(index);
            if(temp=="*"){
                arr.remove(index);
                continue;
            }
            index++;
        }
    }
    public void print(){
        System.out.print("[");
        for (int i = 0; i < arr.size()-1; i++) {
            System.out.print(arr.get(i)+", ");
        }
        System.out.println(arr.get(arr.size()-1)+"]");
    }
}
public class w4_3 {
    public static void main(String[] args) {
        Star s = new Star();
        Scanner in = new Scanner(System.in);
        String temp;
        while(true){
            temp = in.next();
            if(temp.charAt(0)=='1'||temp.charAt(0)=='2'){
                break;
            }
        
            s.add(temp);
        }
        
        for(int i=0;i<2;i++){
            if(temp.charAt(0)=='1'){
                s.addStars();
                s.print();
            }
            else if(temp.charAt(0)=='2'){
                s.removeStars();
                s.print();
            }
            temp = in.next();
        }
    }
}
