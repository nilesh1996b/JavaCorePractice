package PracticeFour;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));

        System.out.println(ts);
    }
}

class Point implements Comparable
{
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public int compareTo(Object p) {

        Point o = (Point)p;

        if(this.x<o.x) return -1;
        else if(this.x>o.x) return 1;
        else {
            if(this.y<o.y) return -1;
            else if(this.y>o.y) return 1;
            else return 0;

        }
    }
}


