package Chapter14;

import javax.swing.*;
import java.awt.*;


public class example14_1 extends JFrame{
    public example14_1(){
        setTitle("example of timer Thread that extends Thread class");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);

        setSize(300,170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args){
        new example14_1();
    }
}
class TimerThread extends Thread{
    private JLabel timerLabel;

    public TimerThread(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }

    @Override
    public void run(){//run function exist in Thread Class
        int n = 0 ;
        while(n<31){
            timerLabel.setText(Integer.toString(n));
            n++;

            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                return ;
            }

        }
    }
}
