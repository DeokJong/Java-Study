package Chapter9;

import java.util.Iterator;
import java.util.Vector;

public class example9_4 {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        Iterator<Integer> it = v.iterator();

        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }

        int sum=0;

        while(it.hasNext()){
            int n = it.next();
            sum+=n;
        }
        System.out.printf("Sum of Integer is %d",sum);
    }
}
