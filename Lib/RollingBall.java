package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener {
    int x=100;
    int y=90;
    int start_angle =0;
    int ballsize = 80;
    public RollingBall(){
        Timer t=new Timer(100, this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, y, ballsize, ballsize);
        g.fillArc(x, y, ballsize, ballsize, start_angle,180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x-=2;
        start_angle+=5;
        if(x<=-ballsize) x=getWidth();
        if(start_angle>=360)start_angle=0;
        repaint();
    }

    
}
