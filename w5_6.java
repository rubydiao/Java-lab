package w5;

class Data{
    private int Day;
    private String month;
    private int year;
    
    Data(){}
    
    Data(int Day,String month,int year){
        this.Day = Day;
        this.month = month;
        this.year = year;
    }
    
    public void set(int Day,String month,int year){
        this.Day = Day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay(){
        return Day;
    }
    
    public String getmonth(){
        return month;
    }
    
    public int getyear(){
        return year;
    }
    
}

class Person extends Data{
    private String name;
    private String sname;
    private int age;
    
    Person(){
        super();
    }
    
    Person(String name,String sname,int age,int Day,String month,int year){
        super(Day,month,year);
        this.name = name;
        this.age = age;
        this.sname = sname;     
    }
    public void set(String name,String sname,int age,int Day,String month,int year){
        super.set(Day, month, year);
        this.name = name;
        this.age = age;
        this.sname = sname;
    }
    
    public String getname(){
        return name;
    }
    
    public int getage(){
        return age;
    }
    
    public String getsname(){
        return sname;
    }
    
    
}

class Account{
    Person p;
    private double monny;
    private double d;
    
    Account(){
        p = new Person();
        this.monny = 0;
    }
    
    Account(String name,String sname,int age,int Day,String month,int year,double monny){
        p = new Person(name,sname,age,Day,month,year);
        this.monny = monny;
    }
    
    public double getmonny(){
        return monny;
    }
    
    public void setmonny(double m){
        monny = m;
    }
    public double getMonthlyInterest(){
        return monny*(d+1);
    }
    public void setMonthlyInterest(double d){
        this.d = d/100.0;
    }
    @Override
    public String toString(){
        return ""+(getmonny());
    }
     
}

class SavingAccount extends Account{
    public void transferMoney(Account acc1,double monny){
        if(monny > getmonny()-20){
            System.out.println("Can't transferMoney");
        }
        else{
        setmonny(getmonny()-20-monny);
        acc1.setmonny(monny+acc1.getmonny());
        }
    }
    
    SavingAccount(String name,String sname,int age,int Day,String month,int year,double monny,double d){
        super(name,sname,age,Day,month,year,monny);
        setMonthlyInterest(d);
    }
    
    @Override
    public String toString(){
        return ""+(getmonny());
    }
    
}

class FixAccount extends Account{
    FixAccount(String name,String sname,int age,int Day,String month,int year,double monny,double d){
        super(name,sname,age,Day,month,year,monny);
        setMonthlyInterest(d);
    }
    
    public void transferMoney(Account acc1,double monny){
        System.out.println("Can't transferMoney");
    }
}


public class w5_6 {
    public static void main(String[] args) {
        SavingAccount A = new SavingAccount("a","A",14,5,"12",2017,20000,4.5);
        SavingAccount B = new SavingAccount("b","B",14,5,"12",2017,0,4.5);
        A.transferMoney(B, 2500);
        System.out.println(A);
        System.out.println(B);
        System.out.println(A.getMonthlyInterest());
        System.out.println(B.getMonthlyInterest());
        FixAccount C = new FixAccount("a","A",14,5,"12",2017,20000,4.5);
        FixAccount D = new FixAccount("b","B",14,5,"12",2017,0,4.5);
        C.transferMoney(D, 2500);
    }
    
}
