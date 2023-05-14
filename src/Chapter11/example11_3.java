package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example11_3 extends JFrame {
    public example11_3(){
        setTitle("Action event listener script");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b= (JButton)e.getSource();

                if(b.getText().equals("Action")) b.setText("액션");
                else{
                    b.setText("Action");
                    setTitle(b.getText());
                }
            }
        });

        setSize(350,100);
        setVisible(true);
    }

    public static void main(String[] args){
        new example11_3();
    }
}
