package MainFiles;

import Data.DataTransferOutput;
import Data.Node;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.PriorityQueue;


public class View extends JFrame {
    public View() throws Exception {
        setTitle("Quiz Time");
        ImageIcon wl=new ImageIcon(ClassLoader.getSystemResource("icons/ic.png"));
        Image wl2=wl.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        setIconImage(wl2);
        getContentPane().setBackground(Color.cyan);
        setLayout(null);
        setBounds(240,120,800,500);
        setVisible(true);

        JLabel highest=new JLabel("Top 10 Players:");
        highest.setBounds(45,30,700,40);
        highest.setFont(new Font("Tahoma",Font.PLAIN,25));
        highest.setForeground(Color.blue);
        add(highest);

        JLabel name=new JLabel("Name");
        name.setBounds(53,65,200,40);
        name.setFont(new Font("Tahoma",Font.PLAIN,20));
        name.setForeground(Color.blue);
        add(name);

        JLabel score=new JLabel("Score");
        score.setBounds(253,65,500,40);
        score.setFont(new Font("Tahoma",Font.PLAIN,20));
        score.setForeground(Color.blue);
        add(score);

        ResultSet vr=new DataTransferOutput().r;
        PriorityQueue<Node> topScore=new PriorityQueue<>();
        while (vr.next()) {
            topScore.add(new Node(vr.getString(2),vr.getInt(3)));
        }
        JLabel LName,Score;
        int i=0;
        while(!topScore.isEmpty()){
            Node x=topScore.remove();

            LName=new JLabel(x.getName());
            LName.setBounds(53,90+i,200,40);
            LName.setFont(new Font("Tahoma",Font.PLAIN,20));
            LName.setForeground(Color.blue);
            add(LName);

            Score=new JLabel(String.valueOf(x.getScore()));
            Score.setBounds(253,90+i,500,40);
            Score.setFont(new Font("Tahoma",Font.PLAIN,20));
            Score.setForeground(Color.blue);
            add(Score);

            i+=23;
        }
    }

    public static void main(String[] args) throws Exception {
        new View();
    }
}
