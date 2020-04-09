
package w3;
class Coin {

    public String side;
    public int value;
    public String list[] = {"T", "H"};

    Coin() {
        side = "H";
        value = 0;
    }

    Coin(String side, int value) {
        this.side = side;
        this.value = value;
    }

    Coin(Coin c) {
        this.side = c.side;
        this.value = c.value;
    }

    void flip() {
        this.side = list[(int) (Math.random() * 10) % 2];

    }

    void reverse() {
        if (this.side == "H") {
            this.side = "T";
        } else {
            this.side = "H";
        }
    }

    void equals(String b, int v) {
        if(b.equals(this.side)&& v == this.value){
            System.out.println(this.value+" "+"(1)equal"+" "+this.value+"(2)");
        }
        else{
            System.out.println(this.value+" "+"(1)Non equal"+" "+this.value+"(2)");
        }
    }
    void print(){
        System.out.println("value is"+" "+this.value+"Side is"+" "+this.side);
    }
    
}
public class demo {

  
         public static void main(String[] args) {
        Coin[] n = new Coin[4];
        n[0] = new Coin("H",1);
        n[1] = new Coin("H",1);n[2] = new Coin("T",5);n[3] = new Coin("T",5);
        
        for(int i = 0 ; i < 20 ; i++){
            n[0].flip();
            n[1].reverse();
            n[2].flip();
            n[3].reverse();
        }
             
           for(int i = 0 ; i<4 ; i++)
           {
               n[i].print();
           }
         n[0].equals(n[1].side,n[1].value);
         n[2].equals(n[3].side,n[3].value);

             
    
    
}
}
