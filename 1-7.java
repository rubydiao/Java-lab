
package w1;

import java.util.Date;
import java.util.Scanner;
//class date
//{
//    int m,d,y;
//    date(){}
//    date(int d,int m,int y)
//    {
//        this.d = d;
//        this.m = m;
//        this.y = y;
//    }
//    public String toString()
//    {
//        return "Date :" +this.d+ "/" +this.m+ "/" +this.y;
//    }
//}
class account
{
    private int id;
    private double balance;
    private double InRate = (4.5/100) / 12;
    private Date DateCreated;
    private double withdraw = 2500;
    private double deposit = 3000;
    private double transfer = 5000;
    private double money;
    public void Date()
    {
        
    }
    account()
    {
       
    }
    account(int id,double balance)
    {
        this.id = id;
        this.balance = balance;
    }
    public int getid()
    {
        return this.id;
    }
    public void setbalance(double balance)
    {
        this.balance = balance;
    }
    public double getbalance()
    {
        return this.balance;
    }
//    public Date getDateCreated()
//    {
//        return this.DateCreated;
//    }
    public void setInRateMonth()
    {
        this.balance = this.balance + (this.balance * this.InRate);
    }
    public void setInRateShow()
    {
        this.InRate = this.balance * this.InRate;
    }
    public void withdraw()
    {
        this.balance = this.balance - this.withdraw;
    }
    public void deposit()
    {
        this.balance = this.balance + this.deposit;
    }
    public void Transfer(account target , double money)
    {
        this.balance -= money;
        target.setbalance(target.getbalance() + money);
    }
    public void Print()
    {
        System.out.println(this.id + "   "+ this.balance + "        " +this.InRate);
        
    }
}

public class Account {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       account obj1 = new account(1122,20000);
        account obj2 = new account(1169,800);
        System.out.println("ID     �ʹ1     �ѵ�Ҵ͡����");
        obj1.getbalance();
        obj1.Print();
        System.out.print("\t �ʹ����͡���� #1 \n");
        obj1.setInRateMonth();
        obj1.Print();
        System.out.print("\t �͹�ѭ�� #1 2500\n");
        obj1.withdraw();
        obj1.Print();
        System.out.print("\t �ҡ��Һѭ��#1 3000\n");
        obj1.deposit();
        obj1.Print();
        System.out.println("ID     �ʹ�ѭ��#2      ");
        obj2.getbalance();
        obj2.Print();
        System.out.print("\t # 1 �͹��Һѭ�շ�� #2 3000\n");
        obj1.Transfer(obj2, 3000);
        obj1.Print();
        obj2.Print();
        
        
    }
    
}
