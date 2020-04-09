
package truemoveh;
import java.util.ArrayList;
import java.util.Scanner;
abstract class Employee{
    private String firstname;
    private String lastname;
    private String id;
    private double salary;
    public int year;
    public String getf(){
        return firstname;
    }
    
    public String getl(){
        return lastname;
    }
    
    public String getid(){
        return id;
    }
    
    public double getsa(){
        return salary;
    }
    
    public Employee(String f,String l,String id){
        this.firstname = f;
        this.lastname = l;
        this.id = id;
        
    }

    public abstract double earning();
    public abstract double bonus(int year);
}
class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(String f, String l, String id,double sal) {
        super(f, l, id);
        this.salary = sal;
    }
    public double earning(){
        return salary*0.95;
    }
    
    public double bonus(int year){
        if(year>5){
            return salary*12;
        }
        else{
            return salary*6;
        }
    }

    
  
}
 class ComEmployee extends Employee{
    private double grossSale;
    private double ComRate;

    public ComEmployee(String f, String l, String id,double sales, double percent) {
        super(f, l, id);
        this.grossSale = sales;
        this.ComRate = percent;
    }
    public double bonus(int year){
        if(year>5){
            return grossSale*6;
        }
        else{
            return grossSale*3;
        } 
    }
     public double earning(){
        double commission ;
        commission = grossSale*ComRate;
        return commission ;
    }
    
    
}
public class w7_4 {
    public static void printEmp(ArrayList<Employee> a){
        double[] arrayEarn = new double[a.size()];
        double[] arrayBonus = new double[a.size()];
        for (int i = 0; i < a.size(); i++) {
            Employee b = a.get(i);
            arrayEarn[i] = b.earning();
            arrayBonus[i] = b.bonus(6);
        }
        for (int i = 0; i < a.size(); i++) {
            Employee b = a.get(i);
            System.out.println(b.getf()+" "+b.getl()+" "+b.earning()+" "+b.bonus(6));
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Employee> arraylist = new ArrayList();
        arraylist.add(new SalariedEmployee("park","kuy","111",2500));
        arraylist.add(new SalariedEmployee("park","d","111",3000));
        arraylist.add(new ComEmployee("park","k","111",5600,0.05));
        arraylist.add(new ComEmployee("park","k8","111",5000,0.023));
printEmp(arraylist);
    }
    
}

