package javaproject;

import javax.swing.*;
import java.awt.*;

public class Bg extends Canvas {
    private static JFrame f;
    public void paint(Graphics g){
        f = new JFrame();
        f.setSize(1482,720);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("/Users/shashankgoud/Desktop/s.png");
        g.drawImage(i,0,0,this);
        f.add(this);
        f.setVisible(true);

    }
}
