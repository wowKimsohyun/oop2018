package week5_6;


import javax.swing.*;
import java.awt.*;

public class Diagram extends JFrame implements Runnable{
    Thread thread;
    private long delay;
    private int vx;
    private int vy;
    public Diagram(){
        setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //thread = new Thread(this);
        //thread.start();
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        Circle circle = new Circle("pink",1,1,60);
        g.setColor(circle.color);
        g.fillOval(circle.x,circle.y,circle.getRad(),circle.getRad());
        g.setColor(circle.color);
        g.drawOval(circle.x,circle.y,circle.getRad(),circle.getRad());
    }
    public static void main (String[] args){
        new Diagram();
    }

    @Override
    public void run() {
        while(isVisible()) {
            try {
                Thread.sleep(delay);
            } catch(InterruptedException e) {
                System.out.println("interrupted");
            }
           // move();
            repaint();
        }
    }
}
