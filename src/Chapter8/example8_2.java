package Chapter8;

import java.io.*;

public class example8_2 {//Show with FileInputStream and InputStreamReader
    public static void main(String[] args){
        InputStreamReader in;//스트림에서 입력받은 값을 지정한 형태로 바꿈
        FileInputStream fin;//파일의 바이너리값 입력받음

        try{
            fin = new FileInputStream("C:\\Users\\Jin DeokJong\\Documents\\IntelliJeil Projects\\Java Study\\Hangle_Text.txt");
            in = new InputStreamReader(fin,"UTF-8");
            int c;

            System.out.println("인코딩 문자 집합은 "+in.getEncoding());
            while((c= in.read())!=-1){System.out.print((char)c);}

            in.close();
            fin.close();
        }
        catch(IOException e){
            System.out.println("InOut Stream Error");
        }

    }
}
