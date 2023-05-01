package Chapter8;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class example8_2_Test_1 {
    public static void main(String[] args){
        InputStreamReader in;
        OutputStreamWriter out;
        int c;

        try{
            in=new InputStreamReader(System.in,"US-ASCII");
            out = new OutputStreamWriter(System.out,"US-ASCII");
            while((c=in.read())!=-1){
               out.write(c);
            }
        }
        catch(IOException e){
            System.out.print("Inout Stream Error!");
        }
    }
}
