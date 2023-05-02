package Chapter9;

import java.util.Vector;
public class example9_2 {
    public static void main(String[] args){
        Vector<Point> pv = new Vector<>();

        pv.add(new Point(2,3));
        pv.add(new Point(-5,20));
        pv.add(new Point(30,-8));

        pv.remove(1);

        for(int i =0;i<pv.size();i++){
            System.out.println(pv.get(i).toString());
        }
    }
}


class Point{
    private int x,y;
    public Point(int x,int y){
        this.x =x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
