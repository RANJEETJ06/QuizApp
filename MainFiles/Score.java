package MainFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JButton close,again;
    public Score(String name,int score){
        setTitle("Quiz Time");
        ImageIcon wl=new ImageIcon(ClassLoader.getSystemResource("icons/ic.png"));
        Image wl2=wl.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        setIconImage(wl2);
        getContentPane().setBackground(Color.cyan);
        setLayout(null);
        setBounds(240,120,800,500);
        setVisible(true);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        JLabel image=new JLabel(new ImageIcon(i2));
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading=new JLabel("Thank You "+name+" For Participating In Game");
        heading.setBounds(45,30,700,40);
        heading.setFont(new Font("Tahoma",Font.PLAIN,25));
        heading.setForeground(Color.blue);
        add(heading);
        JLabel display=new JLabel("Your Score is "+score);
        display.setBounds(450,300,200,30);
        display.setFont(new Font("Tahoma",Font.PLAIN,20));
        display.setForeground(Color.blue);
        add(display);
        close=new JButton("Close");
        close.setBounds(550,380,120,30);
        close.addActionListener(this);
        add(close);
        again=new JButton("Play Again");
        again.setBounds(380,380,120,30);
        again.addActionListener(this);
        add(again);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==again){
            setVisible(false);
            new index("");
        }else{
            setVisible(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }
}
