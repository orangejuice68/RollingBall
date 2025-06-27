package Lib;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RollingBall extends JPanel implements ActionListener {
   
    int x = 100;
    int y = 90;
    int start_angle = 0;
    int ball_size = 80;

    public RollingBall(){
        Timer t =new Timer(20,this);
        t.start();
    }
    protected void printComponent (Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, WIDTH, HEIGHT);
        g.fillArc(x, y, WIDTH, HEIGHT, ABORT, start_angle);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y,80,80);
        g.fillArc(x,y,80,80,start_angle,180);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        x -= 2;
        start_angle+=5;
        if(x<= -ball_size) x=getWidth();
        if(start_angle>=360) start_angle=0;
        repaint();
    }
}
