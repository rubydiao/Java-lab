
package w4;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
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
    
    public Employee(String f,String l,String id,double sal){
        this.firstname = f;
        this.lastname = l;
        this.id = id;
        this.salary = sal;
    }
    
    public double earning(){
        return salary*0.95;
    }
    
    public double bonus(){
        if(year>5){
            return salary*12;
        }
        else{
            return salary*6;
        }
    }
    
}
public class w4_6 {
    public static void printEmp(ArrayList a){
        for (int i = 0; i < a.size(); i++) {
            Employee temp = (Employee) a.get(i);
            System.out.println(temp.getf()+" "+temp.getl()+" "+" "+temp.getsa()+" "+temp.bonus());
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> arrayEarn = new ArrayList();
        
        
        while(true){
            String f,l,id;
            double sal;
            
            System.out.print("Firstname : ");
            f = in.next();
            if(f.charAt(0)=='0'){
                break;
            }
            System.out.print("Lastname : ");
            l = in.next();
            System.out.print("id :");
            id = in.next();
            System.out.print("Salary : ");
            sal = in.nextDouble();
            System.out.print("Year : ");
            int year = in.nextInt();
            Employee b = new Employee(f,l,id,sal);
            b.year = year;
            arrayEarn.add(b);
        }
        printEmp(arrayEarn);
        
    }
    
}
