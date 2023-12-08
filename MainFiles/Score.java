package MainFiles;

import Data.DataTransferInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JButton close,again,view;
    Color words=new Color(226,223,210);
    Color bg=new Color(20,66,114);
    public Score(String name,int score){
        setTitle("Quiz Time");
        ImageIcon wl=new ImageIcon(ClassLoader.getSystemResource("icons/ic.png"));
        Image wl2=wl.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        setIconImage(wl2);
        getContentPane().setBackground(bg);
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
        heading.setForeground(words);
        add(heading);
        JLabel display=new JLabel("Your Score is "+score);
        display.setBounds(450,300,200,30);
        display.setFont(new Font("Tahoma",Font.PLAIN,20));
        display.setForeground(words);
        add(display);
        again=new JButton("Play Again");
        again.setBounds(330,380,120,30);
        again.addActionListener(this);
        add(again);
        view=new JButton("View Scores");
        view.setBounds(481,380,120,30);
        view.addActionListener(this);
        add(view);
        close=new JButton("Close");
        close.setBounds(630,380,120,30);
        close.addActionListener(this);
        add(close);
        try{
            new DataTransferInput(name, score);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==again){
            setVisible(false);
            new Login("",false);
        }else if(e.getSource()==view){
            setVisible(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            try {
                new View();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            dispose();
        }
        else{
            setVisible(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            dispose();
        }
    }
}
