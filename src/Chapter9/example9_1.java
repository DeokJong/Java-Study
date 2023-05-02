package Chapter9;

import java.util.Vector;
public class example9_1 {
    public static void main(String[] args){
        Vector<Integer> intVec  = new Vector<>();

        intVec.add(5);
        intVec.add(4);
        intVec.add(-1);

        intVec.add(2,100);

        System.out.printf("size of vector is %d\n",intVec.size());
        System.out.printf("capacitor of vector is %d\n",intVec.capacity());

        for(int i = 0 ; i <intVec.size();i++){
            int n = intVec.get(i);
            System.out.println(n);
        }
    }
}
