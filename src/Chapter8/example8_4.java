package Chapter8;

import java.io.*;
import java.util.Scanner;
public class example8_4 {//Save with FileWriter
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        FileWriter fout;

        try{
            fout = new FileWriter("C:\\Users\\Jin DeokJong\\Documents\\IntelliJeil Projects\\Java Study\\WriteFile.txt");
            while(true){
                String line = scan.nextLine();
                if(line.length()==0) break;

                fout.write(line,0,line.length());
                fout.write("\r\n",0,2);
            }
            fout.close();
        }
        catch (IOException e){
            System.out.print("InOut Stream Error!");
        }
        scan.close();
    }
}