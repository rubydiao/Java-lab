package w5;

import java.util.Date;

class account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date day;
    
    account(){}
    
    account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate / 100;
        day = new Date();
    }
    
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    
    public double getannualInterestRate(){
        return annualInterestRate;
    }
    public void setannualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate / 100;
    }
    
    public double getbalance(){
        return balance;
    }
    public void setid(double balance){
        this.balance = balance;
    }
    
    public Date getday(){
        return day;
    }
    public void setday(){
        this.day = new Date();
    }
    
    public double getMonthlyInterestRate(){
        return balance*annualInterestRate;
    }
    
    public double getMonthlyInterest(){
        return balance*(annualInterestRate+1);
    }
    
    public void withdraw(double balance){
        this.balance = this.balance+balance;
    }
    
    public void deposit(double balance){
        this.balance = this.balance-balance;
    }
    
 
    @Override
    public String toString(){
        return id+" "+balance+" "+day;
    }
}

class addaccount extends account{
    int id = 3;
    addaccount(){
        super();
    }
    
    addaccount(int id,double balance,double annualInterestRate){
        super(id,balance,annualInterestRate);
    }
}

public class w5_5 {
    public static void main(String[] args) {
        addaccount A = new addaccount(1122,20000,4.5);
        A.withdraw(2500);
        A.deposit(3000);
        System.out.println(A.getid());
        System.out.println(A.id);
        System.out.format("%.2f\n", A.getbalance());
        System.out.format("%.2f\n", A.getMonthlyInterestRate());
        System.out.println(A);
    }
    
}
