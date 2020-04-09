package z;

interface Movable{
    abstract void moveup();
    abstract void moveDown();
    abstract void moveLeft();
    abstract void moveRight();
}

class MovableCircle implements Movable{
    
    private final int radius;
    private final MovablePoint center;
    
    MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
            center = new MovablePoint(x,y,xSpeed,ySpeed);
            this.radius = radius;
    }
    
    @Override
    public String toString(){
        return "x : "+center.x+" || y : "+center.y+" || xSpeed : "+center.xSpeed+" || ySpeed : "+center.ySpeed+" || radius : "+radius;
    }
    
    @Override
    public void moveup() {
        center.y++;
    }

    @Override
    public void moveDown() {
        center.y--;
    }

    @Override
    public void moveLeft() {
        center.x--;
    }

    @Override
    public void moveRight() {
        center.x++;
    }
    
    
    
}

class MovablePoint implements Movable{
    
    int x,y,xSpeed,ySpeed;
    
    MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString(){
        return "x : "+x+" || y : "+y+" || xSpeed : "+xSpeed+" || ySpeed : "+ySpeed;
    }
    
    @Override
    public void moveup() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

   
    
}

public class lab7_6 {

    public static void main(String[] args) {
        MovableCircle A = new MovableCircle(5,5,2,7,15);
        MovablePoint B = new MovablePoint(5,5,2,7);
        
        A.moveup();
        A.moveRight();
        
        B.moveDown();
        B.moveLeft();
        
        System.out.println(A);
        System.out.println(B);
    }
    
}
