package Chapter9;

import java.util.HashMap;
import java.util.Scanner;

public class example9_5 {
    public static void main(String[] args){
        HashMap<String,String> dic= new HashMap<>();

        dic.put("1year","baby");
        dic.put("like","love");
        dic.put("apple","fruit");

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("find word? >>");
            String tempStr = scan.next();

            if(tempStr.equals("exit")){
                System.out.println("System is exit");
                break;
            }

            String value = dic.get(tempStr);

            if(value == null){
                System.out.print("This word is not exist\n");
            }
            else{
                System.out.printf("%s\n",value);
            }
        }

        scan.close();
    }
}
