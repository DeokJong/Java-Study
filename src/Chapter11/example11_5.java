package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class example11_5 extends JFrame {
    private JLabel la = new JLabel("Hello");
    public example11_5(){
        setTitle("Mouse event example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.addMouseListener(new MyMouseAdapter());

        c.setLayout(null);
        la.setSize(50,20);
        la.setLocation(30,30);
        c.add(la);

        setSize(250,250);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e){
            int x= e.getX();
            int y=e.getY();
            la.setLocation(x,y);
        }
    }

    public static void main(String[] args){
        new example11_5();
    }
}
