package Chapter10;

import javax.swing.*;
import java.awt.*;

public class example10_4 extends JFrame {
    public example10_4(){
        setTitle("BoarderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new BorderLayout(30,20));
        c.add(new JButton("Calculate"),BorderLayout.CENTER);
        c.add(new JButton("add"),BorderLayout.EAST);
        c.add(new JButton("sub"),BorderLayout.WEST);
        c.add(new JButton("mul"),BorderLayout.NORTH);
        c.add(new JButton("div"),BorderLayout.SOUTH);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new example10_4();
    }
}
