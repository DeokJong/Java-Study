package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example11_1 extends JFrame {
        public example11_1(){
            setTitle("Action event Listener example");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container c = getContentPane();

            c.setLayout(new FlowLayout());
            JButton btn = new JButton("Action");
            btn.addActionListener(new MyActionListener());
            c.add(btn);

            setSize(350,150);
            setVisible(true);
        }
        public static void main(String[] args){
           new example11_1();
        }
}

//action 1
class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton)e.getSource();

        if(b.getText().equals("Action")) b.setText("액션");
        else b.setText("Action");
    }
}