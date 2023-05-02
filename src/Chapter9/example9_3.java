package Chapter9;

import java.util.ArrayList;
import java.util.Scanner;

public class example9_3 {
    public static void main(String[] args){
        ArrayList<String> as = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for(int i = 0 ; i < 4 ; i++){
            System.out.print("type name>>");
            as.add(scan.next());
        }

        for(int i = 0 ; i<as.size();i++){
            System.out.printf("%s ",as.get(i));
        }
        System.out.println();

        int longestIndex=0;

        for(int i = 1 ; i<as.size();i++){
            if(as.get(longestIndex).length()<as.get(i).length()) longestIndex=i;
        }

        System.out.printf("Longest name is %s",as.get(longestIndex));
    }
}