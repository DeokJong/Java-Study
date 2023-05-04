package Chapter10;

import javax.swing.*;
public class example10_1 extends JFrame{

    public example10_1(){
        setTitle("300X300 Swing title make");
        setSize(300,300);
        setVisible(true);
    }//이런 방식을 권장함
    public static void main(String[] args){
        example10_1 fram = new example10_1();
    }
}
