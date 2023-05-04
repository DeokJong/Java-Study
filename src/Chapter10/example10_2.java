package Chapter10;

import javax.swing.*;
import java.awt.*;

public class example10_2 extends JFrame {
    public example10_2(){
        setTitle("ContentPane and JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args){
        example10_2 ex = new example10_2();
    }
}
