package Chapter8;

import java.io.*;

public class example8_3 {//Show Error case with InputStreamReader, FileInputStream;
    public static void main(String[] args){
        InputStreamReader in;
        FileInputStream fin;

        try{
            fin=new FileInputStream("C:\\Users\\Jin DeokJong\\Documents\\IntelliJeil Projects\\Java Study\\hangle_Text.txt");
            in=new InputStreamReader(fin,"US-ASCII");
            int c;

            while((c= in.read())!=-1) {
                System.out.print((char) c);
            }
        }
        catch (IOException e){
            System.out.print("InOut Stream Error!");
        }
    }
}
