package Chapter10;

import javax.swing.*;
import java.awt.*;

public class example10_5 extends JFrame {
    public example10_5(){
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,2);
        grid.setVgap(5);

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" name"));
        c.add(new JTextField(""));
        c.add(new JLabel(" student_Id"));
        c.add(new JTextField(""));
        c.add(new JLabel(" department"));
        c.add(new JTextField(""));
        c.add(new JLabel("lesson"));
        c.add(new JTextField(""));
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args){
        new example10_5();
    }
}
