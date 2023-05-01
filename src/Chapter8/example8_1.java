package Chapter8;

import java.io.FileReader;
import java.io.IOException;

public class example8_1 {
    public static void main(String[] args){
        FileReader fin;
        System.out.println();
        try{
            fin= new FileReader("c:\\windows\\system.ini");//해당 텍스트를 입력 스트림으로 지정한 객체 생성
            int c;
            while((c=fin.read())!=-1){//지정한 객체에서 한글자씩 읽어드림. 리턴값이 유니코드이므로 int 변수;
                                      //마지막 리턴값은 -1;
                System.out.print((char)c);//강제 형변환으로 출력
            }
            fin.close();
        }
        catch (IOException e){
            System.out.println("InOut Error!");
        }
    }
}
