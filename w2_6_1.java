package w2;

import java.util.Scanner;

class Palindome
{
   private String a;
  Palindome(){
      
  }
  
  public void Check(String a)
  {
      int length_id = a.length();
      String reverse = "";
      //String reverse = new StringBuffer(id).reverse().toString();
      for(int i = length_id - 1 ; i >= 0 ; i--){
          reverse = reverse + a.charAt(i);}
          if(a.equals(reverse))
          
              System.out.print("palindome");
          
          else
          
              System.out.print("Non palindome");
          
      
      
  }
  public String id_return(String id)
  {
      return id;
  }
};
public class w2_6 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        String original;
        original = input.nextLine();
        original = original.toUpperCase();
        original = original.replaceAll("[^a-zA-Z1-9]", "");
        Palindome l1 = new Palindome();
        l1.Check(original);
        
    }
    
}
