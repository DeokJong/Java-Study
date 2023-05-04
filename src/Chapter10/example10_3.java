package Chapter10;

import javax.swing.*;
import java.awt.*;

public class example10_3 extends JFrame {
    public example10_3(){
        setTitle("FlowLayOut Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("calculation"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new example10_3();
    }
}
