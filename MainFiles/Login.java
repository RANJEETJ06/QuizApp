package MainFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Login extends JFrame implements ActionListener {
    JButton play,close;
    JTextArea inputName;
    Color words=new Color(226,223,210);
    public static void main(String[] args) {
        new Login("");
    }
    public Login(String LoginName){
        setTitle("Quiz Time");
        ImageIcon wl=new ImageIcon(ClassLoader.getSystemResource("icons/ic.png"));
        Image wl2=wl.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        setIconImage(wl2);
        getContentPane().setBackground(new Color(20,66,114));
        setLayout(null);
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i);
        image.setBounds(20,80,400,300);
        add(image);
        setSize(900,500);
        setLocation(200,100);
        setVisible(true);

        JLabel heading=new JLabel("Login");
        heading.setBounds(590,90,300,50);
        heading.setFont(new Font("Times New Roman",Font.BOLD,40));
        heading.setForeground(words);
        add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(570,140,300,50);
        name.setFont(new Font("Times New Roman", Font.BOLD,20));
        name.setForeground(words);
        add(name);

        inputName=new JTextArea();
        inputName.setText(LoginName);
        inputName.setBounds(500,210,300,27);
        inputName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(inputName);

        play=new JButton("Play");
        play.setBounds(680,290,80,27);
        play.setFont(new Font("Times New Roman", Font.PLAIN,15));
        play.addActionListener(this);
        add(play);

        close=new JButton("Exit");
        close.setBounds(525,290,80,27);
        close.setFont(new Font("Times New Roman", Font.PLAIN,15));
        close.addActionListener(this);
        add(close);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==close){
            setVisible(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }else{
            setVisible(false);
            new Rules(inputName.getText());
        }
        dispose();
    }
}
