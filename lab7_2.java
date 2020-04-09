package z;

public class lab7_2 implements Cloneable, Comparable<lab7_2> {

    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public lab7_2(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(lab7_2 o) {
        if (area > o.area) {
            return 1;
        } else if (area < o.area) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        lab7_2 house1 = new lab7_2(1, 1750.50);
        lab7_2 house2 = (lab7_2)house1.clone();
    }
}

